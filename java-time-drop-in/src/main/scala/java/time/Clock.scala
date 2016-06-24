package java.time

import com.zoepepper.facades.jsjoda.{Clock => ClockF}

object Clock extends {
  def systemUTC(): Clock = ClockF.systemUTC()
  def systemDefaultZone(): Clock = ClockF.systemDefaultZone()
//  def system(zone: ZoneId): Clock = new Clock(ClockF.system(zone.zoneF))
//  def fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = new Clock(ClockF.fixed(instant.f, zoneOffset.f))
}

class Clock protected[time](protected[time] val f: ClockF) {
  def this() = this(null) // For binary compatibility.

  def millis(): Long = f.millis().toLong
  def instant(): Instant = f.instant()
//  def zone(): ZoneId = clockF.zone

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
