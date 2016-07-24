# scalajs-jsjoda

`scalajs-jsjoda` consists of 2 subprojects:
* `facade`: A Scala.js facade for the `js-joda` JavaScript library (https://github.com/js-joda/js-joda).
* `java-time-drop-in`: A proxy to the `facade` that sits in the `java.time` package,
implementing as much as possible of Java 8's `java.time` API by delegating to the `js-joda` `facade`,
and thus effectively enabling most of this API in Scala.js projects.

## Usage

To just use the `js-joda` facade, simply add the following line to your sbt settings:

```scala
libraryDependencies += "com.zoepepper" %%% "scalajs-jsjoda" % "1.0.4"
```

To use the facade as a `java.time` API implementation, add also:

```scala
libraryDependencies += "com.zoepepper" %%% "scalajs-jsjoda-as-java-time" % "1.0.4"
```

If you have a `crossProject`, the settings must be used only in the JS part:

```scala
lazy val myCross = crossProject.
  ...
  jsSettings.(
    libraryDependencies ++= Seq(
      "com.zoepepper" %%% "scalajs-jsjoda" % "1.0.4",
      "com.zoepepper" %%% "scalajs-jsjoda-as-java-time" % "1.0.4"
    )
  )
```

# Requirements

Version 1.1.8 or greater of `js-joda` needs to be available in your JS runtime. This
can be achieved by adding to sbt:

```scala
jsDependencies += "org.webjars.npm" % "js-joda" % "1.1.8" / "dist/js-joda.js" minified "dist/js-joda.min.js"
```

# Caveats

Usage is limited to functionality provided by `js-joda`. At the moment, this means:

* Limited to `IsoChronology` (no support for Hijrah, Japanese, Minguo or ThaiBuddhist chronologies).
* No `OffsetTime`/`OffsetDateTime` support.
* No `Locale` support.
* No IANA timezone support. (Though it seems to be in `js-joda`'s pipeline: https://github.com/js-joda/js-joda/issues/32).

