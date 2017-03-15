import sbt.Keys._

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.11.8", "2.12.1")

def BaseProject(name: String): Project =
  Project(name, file(name))
    .settings(
      organization := "com.zoepepper",
      version := "1.1.0",
      scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings"),
      homepage := Some(url("https://github.com/zoepepper/scalajs-jsjoda")),
      licenses +=("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause")),
      scmInfo := Some(ScmInfo(
        url("https://github.com/zoepepper/scalajs-jsjoda"),
        "scm:git:git@github.com:zoepepper/scalajs-jsjoda.git",
        Some("scm:git:git@github.com:zoepepper/scalajs-jsjoda.git"))),
      publishMavenStyle := true,
      publishTo := {
        val nexus = "https://oss.sonatype.org/"
        if (isSnapshot.value)
          Some("snapshots" at nexus + "content/repositories/snapshots")
        else
          Some("releases" at nexus + "service/local/staging/deploy/maven2")
      },
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
      libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.5" % "test",
      jsDependencies += ("org.webjars.npm" % "js-joda" % "1.3.0" / "dist/js-joda.js" minified "dist/js-joda.min.js") % "test",
      jsDependencies += (ProvidedJS / "test.js" dependsOn "dist/js-joda.js") % "test",
      testFrameworks += new TestFramework("utest.runner.Framework")
    )
    .enablePlugins(ScalaJSPlugin)

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

packagedArtifacts in file(".") := Map.empty