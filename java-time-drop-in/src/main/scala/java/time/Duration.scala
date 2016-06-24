package java.time

import com.zoepepper.facades.jsjoda.{Duration => DurationF}

object Duration {
  def ofDays(days: Long): Duration = DurationF.ofDays(days)
  def ofHours(hours: Long): Duration = DurationF.ofHours(hours)
  def ofMinutes(minutes: Long): Duration = DurationF.ofMinutes(minutes)
  def ofSeconds(seconds: Long): Duration = DurationF.ofSeconds(seconds)
  def ofSeconds(seconds: Long, nanoAdjustment: Long): Duration = DurationF.ofSeconds(seconds, nanoAdjustment)
  def ofMillis(millis: Long): Duration = DurationF.ofMillis(millis)
  def ofNanos(nanos: Long): Duration = DurationF.ofNanos(nanos)
//  def of(amount: Long, unit: TemporalUnit): Duration = js.native
//  def from(amount: Double): Duration = js.native
//  def between(startInclusive: Temporal, endExclusive: Temporal): Duration = js.native
  def parse(text: String): Duration = DurationF.parse(text)

  val ZERO: Duration = DurationF.ZERO
}

class Duration protected[time](protected[time] val f: DurationF) /*extends TemporalAmount*/ {
  def this(seconds: Long, nano: Int) = this(null) // For binary compatibility.

  def getSeconds(): Long = f.getSeconds().toLong
  def getNano(): Int = f.getNano()
  def isZero(): Boolean = f.isZero()
  def isNegative(): Boolean = f.isNegative()
  def withSeconds(seconds: Long): Duration = f.withSeconds(seconds)
  def withNanos(nanoOfSecond: Int): Duration = f.withNanos(nanoOfSecond)
  def plus(duration: Duration): Duration = f.plus(duration)
//  def plus(amountToAdd: Long, unit: ChronoUnit): Duration = js.native
  def plusDays(daysToAdd: Long): Duration = f.plusDays(daysToAdd)
  def plusHours(hoursToAdd: Long): Duration = f.plusHours(hoursToAdd)
  def plusMinutes(minutesToAdd: Long): Duration = f.plusMinutes(minutesToAdd)
  def plusSeconds(secondsToAdd: Long): Duration = f.plusSeconds(secondsToAdd)
  def plusMillis(millisToAdd: Long): Duration = f.plusMillis(millisToAdd)
  def plusNanos(nanosToAdd: Long): Duration = f.plusNanos(nanosToAdd)
  def minus(duration: Duration): Duration = f.minus(duration)
//  def minus(amountToSubtract: Long, unit: ChronoUnit): Duration = js.native
  def minusDays(daysToSubtract: Long): Duration = f.minusDays(daysToSubtract)
  def minusHours(hoursToSubtract: Long): Duration = f.minusHours(hoursToSubtract)
  def minusMinutes(minutesToSubtract: Long): Duration = f.minusMinutes(minutesToSubtract)
  def minusSeconds(secondsToSubtract: Long): Duration = f.minusSeconds(secondsToSubtract)
  def minusMillis(millisToSubtract: Long): Duration = f.minusMillis(millisToSubtract)
  def minusNanos(nanosToSubtract: Long): Duration = f.minusNanos(nanosToSubtract)
  def multipliedBy(multiplicand: Long): Duration = f.multipliedBy(multiplicand)
  def dividedBy(divisor: Long): Duration = f.dividedBy(divisor)
  def negated(): Duration = f.negated()
  def abs(): Duration = f.abs()
  def toDays(): Long = f.toDays().toLong
  def toHours(): Long = f.toHours().toLong
  def toMinutes(): Long = f.toMinutes().toLong
  def toMillis(): Long = f.toMillis().toLong
  def toNanos(): Long = f.toNanos().toLong
  def compareTo(otherDuration: Duration): Int = f.compareTo(otherDuration)

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
