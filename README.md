# scalajs-jsjoda

`scalajs-jsjoda` consists of 2 subprojects:
* `facade`: A Scala.js facade for the `js-joda` JavaScript library (https://github.com/js-joda/js-joda).
* `java-time-drop-in`: A proxy to the `facade` that sits in the `java.time` package,
implementing as much as possible of Java 8's `java.time` API by delegating to the `js-joda` `facade`.
This effectively enables most of the `java.time` API in Scala.js projects.

## Usage

To just use the `js-joda` facade, simply add the following line to your sbt settings:

```scala
libraryDependencies += "com.zoepepper" %%% "scalajs-jsjoda" % "1.0.7"
```

To use the facade as a `java.time` API implementation, add also:

```scala
libraryDependencies += "com.zoepepper" %%% "scalajs-jsjoda-as-java-time" % "1.0.7"
```

If you have a `crossProject`, the settings must be used only in the JS part:

```scala
lazy val myCross = crossProject.
  ...
  jsSettings.(
    libraryDependencies ++= Seq(
      "com.zoepepper" %%% "scalajs-jsjoda" % "1.0.7",
      "com.zoepepper" %%% "scalajs-jsjoda-as-java-time" % "1.0.7"
    )
  )
```

# Requirements

Version 1.1.8 or greater of `js-joda` needs to be available in your JS runtime. This
can be achieved by adding to sbt:

```scala
jsDependencies += "org.webjars.npm" % "js-joda" % "1.1.8" / "dist/js-joda.js" minified "dist/js-joda.min.js"
```

We recommend using the [latest version](https://github.com/js-joda/js-joda/releases) of `js-joda` nonetheless.

# Caveats

Usage is limited to functionality provided by `js-joda`. At the moment, this means:

* Limited to `IsoChronology` (no support for Hijrah, Japanese, Minguo or ThaiBuddhist chronologies).
* No `OffsetTime`/`OffsetDateTime` support.
* No `Locale` support.
* No IANA timezone support. `js-joda` supports this since version `1.3` (https://github.com/js-joda/js-joda/issues/32) through the [js-joda-timezone](https://github.com/js-joda/js-joda-timezone) project. We will add support for this as soon as time permits.

