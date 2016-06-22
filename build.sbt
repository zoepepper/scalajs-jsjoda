name := "Scala.js js-joda as java.time"

normalizedName := "scalajs-js-joda-as-java-time"

version := "1.0.0-SNAPSHOT"

organization := "com.zoepepper"

scalaVersion := "2.11.8"

licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause"))

scmInfo := Some(ScmInfo(
  url("https://github.com/zoepepper/scalajs-js-joda-as-java-time"),
  "scm:git:git@github.com:zoepepper/scalajs-js-joda-as-java-time.git",
  Some("scm:git:git@github.com:zoepepper/scalajs-js-joda-as-java-time.git")))

publishMavenStyle := true

//publishTo := {
//  val nexus = "https://oss.sonatype.org/"
//  if (isSnapshot.value)
//    Some("snapshots" at nexus + "content/repositories/snapshots")
//  else
//    Some("releases" at nexus + "service/local/staging/deploy/maven2")
//}

pomExtra := (
  <developers>
    <developer>
      <id>zoepepper</id>
      <name>Zoë Pepper</name>
      <url>https://github.com/zoepepper/</url>
    </developer>
  </developers>
  )

pomIncludeRepository := { _ => false }