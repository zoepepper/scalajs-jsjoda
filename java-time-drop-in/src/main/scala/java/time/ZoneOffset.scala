package java.time

import java.time.temporal.{TemporalAccessor, TemporalAdjuster}

import com.zoepepper.facades.jsjoda.{ZoneOffset => ZoneOffsetF}

object ZoneOffset {

}

class ZoneOffset protected[time](f: ZoneOffsetF) extends Wraps(f)
  with ZoneId with TemporalAccessor with TemporalAdjuster {
  def adjustInto(temporal: java.time.temporal.Temporal): java.time.temporal.Temporal = ???
  def getId(): String = ???
}
