package java.time

import com.zoepepper.facades.jsjoda.{Clock => ClockF, Instant => InstantF}

object Clock extends {
  def systemUTC(): Clock = new Clock(ClockF.systemUTC())
  def systemDefaultZone(): Clock = new Clock(ClockF.systemDefaultZone())
//  def system(zone: ZoneId): Clock = new Clock(ClockF.system(zone.zoneF))
//  def fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = new Clock(ClockF.fixed(instant.f, zoneOffset.f))
}

class Clock protected[time](protected[time] val f: ClockF) {
  def this() = this(null) // For binary compatibility.

  def millis(): Long = f.millis().toLong
//  def instant(): Instant = clockF.instant
//  def zone(): ZoneId = clockF.zone
}
