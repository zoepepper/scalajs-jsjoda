# scalajs-jsjoda

`scalajs-jsjoda` consists of 2 subprojects:
* `facade`: A Scala.js facade for the `js-joda` JavaScript library (https://github.com/js-joda/js-joda).
* `java-time-drop-in`: A proxy to the `facade` that sits in the `java.time` package,
implementing as much as possible of Java 8's `java.time` API by delegating to the `js-joda` `facade`.
This effectively enables most of the `java.time` API in Scala.js projects.

## Usage

To just use the `js-joda` facade, simply add the following line to your sbt settings:

```scala
libraryDependencies += "com.zoepepper" %%% "scalajs-jsjoda" % "1.1.1"
```

To use the facade as a `java.time` API implementation, add also:

```scala
libraryDependencies += "com.zoepepper" %%% "scalajs-jsjoda-as-java-time" % "1.1.1"
```

If you have a `crossProject`, the settings must be used only in the JS part:

```scala
lazy val myCross = crossProject.
  ...
  jsSettings.(
    libraryDependencies ++= Seq(
      "com.zoepepper" %%% "scalajs-jsjoda" % "1.1.1",
      "com.zoepepper" %%% "scalajs-jsjoda-as-java-time" % "1.1.1"
    )
  )
```

# Requirements

Version 1.1.8 or greater of `js-joda` needs to be available in your JS runtime. This
can be achieved by adding to sbt:

```scala
jsDependencies += "org.webjars.npm" % "js-joda" % "1.1.8" / "dist/js-joda.js" minified "dist/js-joda.min.js"
```

We recommend using the [latest version](https://github.com/js-joda/js-joda/releases) of `js-joda` and `js-joda-time` nonetheless.

## Timezone support

If you need timezone support, at least version 1.3.0 of `js-joda` is required, as well as its 'js-joda-timezone' addon:

```scala
jsDependencies ++= Seq(
  "org.webjars.npm" % "js-joda" % "1.3.0" / "dist/js-joda.js" minified "dist/js-joda.min.js",
  "org.webjars.npm" % "js-joda-timezone" % "1.0.0" / "dist/js-joda-timezone.js" minified "dist/js-joda-timezone.min.js"
)
```

If you use the `java-time-drop-in`, then the `js-joda-timezone` will be automatically bootstrapped for you. However, if you want to just use the `facade` without the `java-time-drop-in`, you need to bootstrap manually by calling:

```scala
import com.zoepepper.facades.jsjoda._

JSJoda.use(JSJodaTimezone)
```

# Caveats

## Limited functionality
Usage is limited to functionality provided by `js-joda`. At the moment, this means:

* Limited to `IsoChronology` (no support for Hijrah, Japanese, Minguo or ThaiBuddhist chronologies).
* No `OffsetTime`/`OffsetDateTime` support.
* No `Locale` support.

## Conflicts with other `java.time._` drop-ins

When using `java-time-drop-in` make sure you don't have conflicting implementations in your dependencies (including transitive ones).
Otherwise you can experience linking errors.

For example, presence of [`scala-js-java-time`](https://github.com/scala-js/scala-js-java-time) can lead to linking errors like the following:

```
[error] Referring to non-existent method java.time.temporal.Temporal.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)scala.Long
[error]   called from java.time.ZonedDateTime.until(java.time.temporal.Temporal,java.time.temporal.TemporalUnit)scala.Long
```
