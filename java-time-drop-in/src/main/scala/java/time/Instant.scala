package java.time


import com.zoepepper.facades.jsjoda.{Instant => InstantF}

import scala.scalajs.js.annotation.JSName


object Instant {
  def now(): Instant = InstantF.now()
  def now(clock: Clock): Instant = InstantF.now(clock)
  def ofEpochSecond(epochSecond: Long): Instant = InstantF.ofEpochSecond(epochSecond)
  def ofEpochSecond(epochSecond: Long, nanoAdjustment: Int): Instant = InstantF.ofEpochSecond(epochSecond, nanoAdjustment)
  def ofEpochMilli(epochMilli: Long): Instant = InstantF.ofEpochSecond(epochMilli)
  //  def from(temporal: Temporal): Instant = scalajs.js.native
  def parse(text: String): Instant = InstantF.parse(text)

  val EPOCH: Instant = InstantF.EPOCH
  val MAX: Instant = InstantF.MAX
  val MIN: Instant = InstantF.MIN
}

class Instant protected[time](protected[time] val f: InstantF) {
  def getEpochSecond(): Long = f.getEpochSecond().toLong
  def getNano(): Int = f.getNano()
  //  def isSupported(field: TemporalField): Boolean = scalajs.js.native
  //  def isSupported(unit: TemporalUnit): Boolean = scalajs.js.native
  //  def getLong(unit: TemporalUnit): Long = scalajs.js.native
  //  def `with`(adjuster: TemporalAdjuster, newValue: Double): Instant = scalajs.js.native
  //  def `with`(field: TemporalField, newValue: Double): Instant = js.native
  //  def withTemporalAdjuster(adjuster: TemporalAdjuster): Instant = js.native
  //  def truncatedTo(unit: TemporalUnit): Instant = js.native
  //  def plus(amount: TemporalAmount): Instant = js.native
  //  def plus(amount: Double, unit: TemporalUnit): Instant = js.native
  def plusSeconds(secondsToAdd: Long): Instant = f.plusSeconds(secondsToAdd)
  def plusMillis(millisToAdd: Long): Instant = f.plusMillis(millisToAdd)
  def plusNanos(nanosToAdd: Long): Instant = f.plusNanos(nanosToAdd)
  //  def minus(amount: TemporalAmount): Instant = js.native
  //  def minus(amount: Double, unit: TemporalUnit): Instant = js.native
  def minusSeconds(secondsToSubtract: Long): Instant = f.minusSeconds(secondsToSubtract)
  def minusMillis(millisToSubtract: Long): Instant = f.minusMillis(millisToSubtract)
  def minusNanos(nanosToSubtract: Long): Instant = f.minusNanos(nanosToSubtract)
  //  def adjustInto(temporal: Temporal): Temporal = js.native
  //  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  def toEpochMilli(): Long = f.toEpochMilli().toLong
  def compareTo(otherInstant: Instant): Int = f.compareTo(otherInstant)
  def isAfter(otherInstant: Instant): Boolean = f.isAfter(otherInstant)
  def isBefore(otherInstant: Instant): Boolean = f.isBefore(otherInstant)

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
