package java.time

import java.time.temporal.{ChronoUnit, Temporal, TemporalAmount, TemporalUnit}

@js.native
@JSName("JSJoda.Duration")
object Duration extends js.Object {
  def ofDays(days: Double): Duration = js.native
  def ofHours(hours: Double): Duration = js.native
  def ofMinutes(minutes: Double): Duration = js.native
  def ofSeconds(seconds: Double, nanoAdjustment: Int = ???): Duration = js.native
  def ofMillis(millis: Double): Duration = js.native
  def ofNanos(nanos: Double): Duration = js.native
  def of(amount: Double, unit: TemporalUnit): Duration = js.native
  def from(amount: Double): Duration = js.native
  def between(startInclusive: Temporal, endExclusive: Temporal): Duration = js.native
  def parse(text: String): Duration = js.native

  val ZERO: Duration = js.native
}

@js.native
class Duration private(seconds: Long, nano: Int) extends TemporalAmount {
  @JSName("seconds") def getSeconds(): Double = js.native
  @JSName("nano") def getNano(): Int = js.native
  def isZero(): Boolean = js.native
  def isNegative(): Boolean = js.native
  def withSeconds(seconds: Double): Duration = js.native
  def withNanos(nanoOfSecond: Int): Duration = js.native
  def plus(duration: Duration): Duration = js.native
  def plus(amountToAdd: Double, unit: ChronoUnit): Duration = js.native
  def plusDuration(duration: Duration): Duration = js.native
  def plusAmountUnit(amountToAdd: Double, unit: ChronoUnit): Duration = js.native
  def plusDays(daysToAdd: Double): Duration = js.native
  def plusHours(hoursToAdd: Double): Duration = js.native
  def plusMinutes(minutesToAdd: Double): Duration = js.native
  def plusSeconds(secondsToAdd: Double, nanoAdjustment: Int = ???): Duration = js.native
  def plusMillis(millisToAdd: Double): Duration = js.native
  def plusNanos(nanosToAdd: Double): Duration = js.native
  def plusSecondsNanos(secondsToAdd: Double, nanosToAdd: Int): Duration = js.native
  def minus(duration: Duration): Duration = js.native
  def minus(amountToSubtract: Double, unit: ChronoUnit): Duration = js.native
  def minusDuration(duration: Duration): Duration = js.native
  def minusAmountUnit(amountToSubtract: Double, unit: ChronoUnit): Duration = js.native
  def minusDays(daysToSubtract: Double): Duration = js.native
  def minusHours(hoursToSubtract: Double): Duration = js.native
  def minusMinutes(minutesToSubtract: Double): Duration = js.native
  def minusSeconds(secondsToSubtract: Double, nanoAdjustment: Int = ???): Duration = js.native
  def minusMillis(millisToSubtract: Double): Duration = js.native
  def minusNanos(nanosToSubtract: Double): Duration = js.native
  def multipliedBy(multiplicand: Double): Duration = js.native
  def dividedBy(divisor: Double): Duration = js.native
  def negated(): Duration = js.native
  def abs(): Duration = js.native
  def toDays(): Double = js.native
  def toHours(): Double = js.native
  def toMinutes(): Double = js.native
  def toMillis(): Double = js.native
  def toNanos(): Double = js.native
  def compareTo(otherDuration: Duration): Int = js.native
}
