import sbt.Keys._

val isScalaJS06 = Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).exists(_.startsWith("0.6."))

def BaseProject(name: String): Project =
  Project(name, file(name))
    .settings(
      organization := "com.zoepepper",
      version := "1.2.0",
      crossScalaVersions := Seq("2.12.11", "2.13.3") ++ Seq("2.11.12").filter(_ => isScalaJS06),
      scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings") ++ Seq("-P:scalajs:suppressMissingJSGlobalDeprecations").filter(_ => isScalaJS06),
      homepage := Some(url("https://github.com/zoepepper/scalajs-jsjoda")),
      licenses +=("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause")),
      scmInfo := Some(ScmInfo(
        url("https://github.com/zoepepper/scalajs-jsjoda"),
        "scm:git:git@github.com:zoepepper/scalajs-jsjoda.git",
        Some("scm:git:git@github.com:zoepepper/scalajs-jsjoda.git"))),
      publishMavenStyle := true,
      publishTo := sonatypePublishToBundle.value,
      pomExtra :=
        <developers>
          <developer>
            <id>zoepepper</id>
            <name>Zoe Pepper</name>
            <url>https://github.com/zoepepper/</url>
          </developer>
          <developer>
            <id>rpiaggio</id>
            <name>Raúl Piaggio</name>
            <url>https://github.com/rpiaggio/</url>
          </developer>
        </developers>,
      pomIncludeRepository := { _ => false },
      libraryDependencies += "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.6",
      libraryDependencies += {
        CrossVersion.partialVersion(scalaVersion.value) match {
          case Some((2, n)) if n >= 12 => "com.lihaoyi" %%% "utest" % "0.7.4" % "test"
          case _ => "com.lihaoyi" %%% "utest" % "0.6.8" % "test"
        }
      },
      jsDependencies += ("org.webjars.npm" % "js-joda" % "1.6.2" / "dist/js-joda.js" minified "dist/js-joda.min.js") % "test",
      jsDependencies += (ProvidedJS / "test.js" dependsOn "dist/js-joda.js") % "test",
      testFrameworks += new TestFramework("utest.runner.Framework")
    )
    .enablePlugins(ScalaJSPlugin)
    .enablePlugins(JSDependenciesPlugin)

lazy val root = (project in file("."))
  .settings(
    crossScalaVersions := Nil
  ).aggregate(facade, javaTime)

lazy val facade =
  BaseProject("facade")
    .settings(
      name := "scalajs-jsjoda"
    )

lazy val javaTime =
  BaseProject("java-time-drop-in")
    .settings(
      name := "scalajs-jsjoda-as-java-time",
      mappings in(Compile, packageBin) ~= {
        _.filter(!_._2.endsWith(".class"))
      },
      exportJars := true
    )
    .dependsOn(facade)

sonatypeProfileName := "com.zoepepper"

packagedArtifacts in root := Map.empty