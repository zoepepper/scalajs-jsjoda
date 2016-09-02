import sbt.Keys._

def BaseProject(name: String): Project =
  Project(name, file(name))
    .settings(
      organization := "com.zoepepper",
      version := "1.0.5",
      scalaVersion := "2.11.8",
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
            <name>Zoë Pepper</name>
            <url>https://github.com/zoepepper/</url>
          </developer>
          <developer>
            <id>rpiaggio</id>
            <name>Raúl Piaggio</name>
            <url>https://github.com/rpiaggio/</url>
          </developer>
        </developers>,
      pomIncludeRepository := { _ => false }
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