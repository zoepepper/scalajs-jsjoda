package java.time

import java.time.format.DateTimeFormatter
import java.time.temporal._

@js.native
@JSName("JSJoda.LocalTime")
object LocalTime extends js.Object {
  def now(clock: Clock = ???): LocalTime = js.native
  def now(zone: ZoneId): LocalTime = js.native
  def ofInstant(instant: Instant, zone: ZoneId = ???): LocalTime = js.native
  def of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalTime = js.native
  def ofSecondOfDay(secondOfDay: Double, nanoOfSecond: Int = 0): LocalTime = js.native
  def ofNanoOfDay(nanoOfDay: Double): LocalTime = js.native
  def from(temporal: Temporal): LocalTime = js.native
  def parse(text: String, formatter: DateTimeFormatter = ???): LocalTime = js.native

  val MAX: LocalDate = js.native
  val MIN: LocalDate = js.native
  val MIDNIGHT: LocalDate = js.native
  val NOON: LocalDate = js.native
}

@js.native
class LocalTime private(hour: Int, minute: Int, second: Int, nanoOfSecond: Int) extends Temporal {
  @JSName("hour") def getHour(): Int = js.native
  @JSName("minute") def getMinute(): Int = js.native
  @JSName("second") def getSecond(): Int = js.native
  @JSName("nano") def getNano(): Int = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def isSupported(unit: TemporalUnit): Boolean = js.native
  def getLong(unit: TemporalUnit): Long = js.native
  def `with`(adjuster: TemporalAdjuster, newValue: Double): LocalTime = js.native
  def `with`(field: TemporalField, newValue: Double): LocalTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalTime = js.native
  def withHour(hour: Int): LocalTime = js.native
  def withMinute(minute: Int): LocalTime = js.native
  def withSecond(second: Int): LocalTime = js.native
  def withNano(nano: Int): LocalTime = js.native
  def truncatedTo(unit: TemporalUnit): LocalTime = js.native
  def plus(amount: TemporalAmount): LocalTime = js.native
  def plus(amount: Double, unit: TemporalUnit): LocalTime = js.native
  def plusHours(hoursToAdd: Double): LocalTime = js.native
  def plusMinutes(minutesToAdd: Double): LocalTime = js.native
  def plusSeconds(secondsToAdd: Double): LocalTime = js.native
  def plusNanos(nanosToAdd: Double): LocalTime = js.native
  def minus(amount: TemporalAmount): LocalTime = js.native
  def minus(amount: Double, unit: TemporalUnit): LocalTime = js.native
  def minusHours(hoursToSubtract: Double): LocalTime = js.native
  def minusMinutes(minutesToSubtract: Double): LocalTime = js.native
  def minusSeconds(secondsToSubtract: Double): LocalTime = js.native
  def minusNanos(nanosToSubtract: Double): LocalTime = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  def atDate(date: LocalDate): LocalDateTime = js.native
  def toSecondOfDay(): Int = js.native
  def toNanoOfDay(): Long = js.native
  def compareTo(other: LocalTime): Int = js.native
  def isAfter(other: LocalTime): Boolean = js.native
  def isBefore(other: LocalTime): Boolean = js.native
  def format(formatter: DateTimeFormatter): String = js.native
}
