package java.time

import java.time.temporal.{Temporal, TemporalAdjuster, TemporalAmount, TemporalField, TemporalUnit}

import com.zoepepper.facades.jsjoda.{Instant => InstantF}

import scala.scalajs
import scala.scalajs.js


object Instant {
  def now(): Instant = InstantF.now()
  def now(clock: Clock): Instant = InstantF.now(clock)
  def ofEpochSecond(epochSecond: Long): Instant = InstantF.ofEpochSecond(epochSecond)
  def ofEpochSecond(epochSecond: Long, nanoAdjustment: Long): Instant = InstantF.ofEpochSecond(epochSecond, nanoAdjustment)
  def ofEpochMilli(epochMilli: Long): Instant = InstantF.ofEpochSecond(epochMilli)
  def from(temporal: Temporal): Instant = InstantF.from(temporal)
  def parse(text: CharSequence): Instant = InstantF.parse(text.toString)

  val EPOCH: Instant = InstantF.EPOCH
  val MAX: Instant = InstantF.MAX
  val MIN: Instant = InstantF.MIN
}

class Instant protected[time](f: InstantF) extends Temporal(f) with TemporalAdjuster {
  def getEpochSecond(): Long = f.getEpochSecond().toLong
  def getNano(): Int = f.getNano()
  def isSupported(unit: TemporalUnit): Boolean = f.isSupported(unit)
//  def `with`(adjuster: TemporalAdjuster): Instant = f.`with`(adjuster)
  def `with`(field: TemporalField, newValue: Long): Instant = f.`with`(field, newValue)
  //  def truncatedTo(unit: TemporalUnit): Instant = js.native
  def plus(amount: TemporalAmount): Instant = f.plus(amount)
  def plus(amountToAdd: Long, unit: TemporalUnit): Instant = f.plus(amountToAdd, unit)
  def plusSeconds(secondsToAdd: Long): Instant = f.plusSeconds(secondsToAdd)
  def plusMillis(millisToAdd: Long): Instant = f.plusMillis(millisToAdd)
  def plusNanos(nanosToAdd: Long): Instant = f.plusNanos(nanosToAdd)
  def minus(amount: TemporalAmount): Instant = f.minus(amount)
  def minus(amountToSubtract: Long, unit: TemporalUnit): Instant = f.minus(amountToSubtract, unit)
  def minusSeconds(secondsToSubtract: Long): Instant = f.minusSeconds(secondsToSubtract)
  def minusMillis(millisToSubtract: Long): Instant = f.minusMillis(millisToSubtract)
  def minusNanos(nanosToSubtract: Long): Instant = f.minusNanos(nanosToSubtract)
//  def adjustInto(temporal: Temporal): Temporal = f.adjustInto(temporal)
  def toEpochMilli(): Long = f.toEpochMilli().toLong
  def compareTo(otherInstant: Instant): Int = f.compareTo(otherInstant)
  def isAfter(otherInstant: Instant): Boolean = f.isAfter(otherInstant)
  def isBefore(otherInstant: Instant): Boolean = f.isBefore(otherInstant)

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
