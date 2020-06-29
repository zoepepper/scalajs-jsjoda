package java.time

import java.Wraps
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}

import com.zoepepper.facades.jsjoda.{Duration => DurationF}

object Duration {
  def between(startInclusive: Temporal, endExclusive: Temporal): Duration = DurationF.between(startInclusive, endExclusive)
  def from(amount: TemporalAmount): Duration = DurationF.from(amount)
  def of(amount: Long, unit: TemporalUnit): Duration = DurationF.of(amount.toDouble, unit)
  def ofDays(days: Long): Duration = DurationF.ofDays(days.toDouble)
  def ofHours(hours: Long): Duration = DurationF.ofHours(hours.toDouble)
  def ofMinutes(minutes: Long): Duration = DurationF.ofMinutes(minutes.toDouble)
  def ofSeconds(seconds: Long): Duration = DurationF.ofSeconds(seconds.toDouble)
  def ofSeconds(seconds: Long, nanoAdjustment: Long): Duration = DurationF.ofSeconds(seconds.toDouble, nanoAdjustment.toDouble)
  def ofMillis(millis: Long): Duration = DurationF.ofMillis(millis.toDouble)
  def ofNanos(nanos: Long): Duration = DurationF.ofNanos(nanos.toDouble)
  def parse(text: CharSequence): Duration = DurationF.parse(text.toString)

  val ZERO: Duration = DurationF.ZERO
}

class Duration protected[time](f: DurationF) extends Wraps(f) with Comparable[Duration]
  with TemporalAmount {
  def abs(): Duration = f.abs()
  def compareTo(otherDuration: Duration): Int = f.compareTo(otherDuration)
  def dividedBy(divisor: Long): Duration = f.dividedBy(divisor.toDouble)
  def getNano(): Int = f.nano()
  def getSeconds(): Long = f.seconds().toLong
  def isNegative(): Boolean = f.isNegative()
  def isZero(): Boolean = f.isZero()
  def minus(duration: Duration): Duration = f.minus(duration)
  def minus(amountToSubtract: Long, unit: TemporalUnit): Duration = f.minus(amountToSubtract.toDouble, unit)
  def minusDays(daysToSubtract: Long): Duration = f.minusDays(daysToSubtract.toDouble)
  def minusHours(hoursToSubtract: Long): Duration = f.minusHours(hoursToSubtract.toDouble)
  def minusMinutes(minutesToSubtract: Long): Duration = f.minusMinutes(minutesToSubtract.toDouble)
  def minusSeconds(secondsToSubtract: Long): Duration = f.minusSeconds(secondsToSubtract.toDouble)
  def minusMillis(millisToSubtract: Long): Duration = f.minusMillis(millisToSubtract.toDouble)
  def minusNanos(nanosToSubtract: Long): Duration = f.minusNanos(nanosToSubtract.toDouble)
  def multipliedBy(multiplicand: Long): Duration = f.multipliedBy(multiplicand.toDouble)
  def negated(): Duration = f.negated()
  def plus(duration: Duration): Duration = f.plus(duration)
  def plus(amountToAdd: Long, unit: TemporalUnit): Duration = f.plus(amountToAdd.toDouble, unit)
  def plusDays(daysToAdd: Long): Duration = f.plusDays(daysToAdd.toDouble)
  def plusHours(hoursToAdd: Long): Duration = f.plusHours(hoursToAdd.toDouble)
  def plusMinutes(minutesToAdd: Long): Duration = f.plusMinutes(minutesToAdd.toDouble)
  def plusSeconds(secondsToAdd: Long): Duration = f.plusSeconds(secondsToAdd.toDouble)
  def plusMillis(millisToAdd: Long): Duration = f.plusMillis(millisToAdd.toDouble)
  def plusNanos(nanosToAdd: Long): Duration = f.plusNanos(nanosToAdd.toDouble)
  def toDays(): Long = f.toDays().toLong
  def toHours(): Long = f.toHours().toLong
  def toMinutes(): Long = f.toMinutes().toLong
  def toMillis(): Long = f.toMillis().toLong
  def toNanos(): Long = f.toNanos().toLong
  def withSeconds(seconds: Long): Duration = f.withSeconds(seconds.toDouble)
  def withNanos(nanoOfSecond: Int): Duration = f.withNanos(nanoOfSecond)

  override def toString(): String = f.toString()
  override def equals(obj: Any): Boolean = obj match {
    case other: Duration => f.equals(other.f)
    case _ => false
  }
}
