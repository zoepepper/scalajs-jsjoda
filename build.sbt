import sbt.Keys._

def BaseProject(name: String): Project =
  Project(name, file(name))
    .settings(
      organization := "com.zoepepper",
      version := "0.0.1-SNAPSHOT",
      scalaVersion := "2.11.8",
      scalacOptions ++= Seq("-feature"),
      licenses +=("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause")),
      scmInfo := Some(ScmInfo(
        url("https://github.com/zoepepper/scalajs-js-joda-as-java-time"),
        "scm:git:git@github.com:zoepepper/scalajs-js-joda-as-java-time.git",
        Some("scm:git:git@github.com:zoepepper/scalajs-js-joda-as-java-time.git"))),
      publishMavenStyle := true,
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