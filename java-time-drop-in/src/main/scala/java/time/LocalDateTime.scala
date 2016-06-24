package java.time

import java.time.format.DateTimeFormatter

import com.zoepepper.facades.jsjoda.{LocalDateTime => LocalDateTimeF}

object LocalDateTime {
  def now(): LocalDateTime = LocalDateTimeF.now()
  def now(clock: Clock): LocalDateTime = LocalDateTimeF.now(clock)
  //  def now(zone: ZoneId): LocalDateTime = js.native
  //  def ofInstant(instant: Instant, zone: ZoneId = ???): LocalDateTime = js.native
  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime =
    LocalDateTimeF.of(year, month, dayOfMonth, hour, minute)
  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime =
    LocalDateTimeF.of(year, month, dayOfMonth, hour, minute, second)
  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime =
    LocalDateTimeF.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond)
  //  def of(year: Int, month: Month, dayOfMonth: Int): LocalDateTime = js.native
  //  def of(year: Int, month: Month, dayOfMonth: Int, second: Int): LocalDateTime = js.native
  //  def of(year: Int, month: Month, dayOfMonth: Int, second: Int, nanoOfSecond: Int): LocalDateTime = js.native
  def of(date: LocalDate, time: LocalTime): LocalDateTime = LocalDateTimeF.of(date, time)
  //  def ofEpochSecond(epochSecond: Double, nanoOfSecond: Int, offset: ZoneOffset): LocalDateTime = js.native
  //  def from(temporal: Temporal): LocalDateTime = js.native
  def parse(text: String): LocalDateTime = LocalDateTimeF.parse(text)
  def parse(text: String, formatter: DateTimeFormatter): LocalDateTime = LocalDateTimeF.parse(text, formatter)

  val MAX: LocalDateTime = LocalDateTimeF.MAX
  val MIN: LocalDateTime = LocalDateTimeF.MIN
}

class LocalDateTime protected[time](protected[time] val f: LocalDateTimeF) /*extends ChronoLocalDateTime[chrono.ChronoLocalDate]*/ {
  def getYear(): Int = f.getYear()
//  def getMonth(): Month = f.getMonth()
  def getMonthValue(): Int = f.getMonthValue()
  def getDayOfMonth(): Int = f.getDayOfMonth()
  def getDayOfYear(): Int = f.getDayOfYear()
  def getDayOfWeek(): DayOfWeek = f.getDayOfWeek()
  def getHour(): Int = f.getHour()
  def getMinute(): Int = f.getMinute()
  def getSecond(): Int = f.getSecond()
  def getNano(): Int = f.getNano()
//  def isSupported(field: TemporalField): Boolean = f.isSupported(field)
//  def isSupported(unit: TemporalUnit): Boolean = js.native
//  def getLong(unit: TemporalUnit): Long = js.native
//  def `with`(adjuster: TemporalAdjuster, newValue: Double): LocalDateTime = js.native
//  def `with`(field: TemporalField, newValue: Double): LocalDateTime = js.native
//  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDateTime = js.native
//  def withFieldAndValue(field: TemporalField, value: Double): LocalDateTime = js.native
  def withYear(year: Int): LocalDateTime = f.withYear(year)
  def withMonth(month: Int): LocalDateTime = f.withMonth(month)
  def withDayOfMonth(dayOfMonth: Int): LocalDateTime = f.withDayOfMonth(dayOfMonth)
  def withDayOfYear(dayOfYear: Int): LocalDateTime = f.withDayOfYear(dayOfYear)
  def withHour(hour: Int): LocalDateTime = f.withHour(hour)
  def withMinute(minute: Int): LocalDateTime = f.withMinute(minute)
  def withSecond(second: Int): LocalDateTime = f.withSecond(second)
  def withNano(nanoOfSecond: Int): LocalDateTime = f.withNano(nanoOfSecond)
//  def truncatedTo(unit: TemporalUnit): LocalDateTime = js.native
//  def plus(amount: TemporalAmount): LocalDateTime = js.native
//  def plus(amount: Long, unit: TemporalUnit): LocalDateTime = js.native
  def plusYears(yearsToAdd: Long): LocalDateTime = f.plusYears(yearsToAdd)
  def plusMonths(monthsToAdd: Long): LocalDateTime = f.plusMonths(monthsToAdd)
  def plusWeeks(weeksToAdd: Long): LocalDateTime = f.plusWeeks(weeksToAdd)
  def plusDays(daysToAdd: Long): LocalDateTime = f.plusDays(daysToAdd)
  def plusHours(hoursToAdd: Long): LocalDateTime = f.plusHours(hoursToAdd)
  def plusMinutes(minutesToAdd: Long): LocalDateTime = f.plusMinutes(minutesToAdd)
  def plusSeconds(secondsToAdd: Long): LocalDateTime = f.plusSeconds(secondsToAdd)
  def plusNanos(nanosToAdd: Long): LocalDateTime = f.plusNanos(nanosToAdd)
//  def minus(amount: TemporalAmount): LocalDateTime = js.native
//  def minus(amount: Long, unit: TemporalUnit): LocalDateTime = js.native
  def minusYears(yearsToSubtract: Long): LocalDateTime = f.minusYears(yearsToSubtract)
  def minusMonths(monthsToSubtract: Long): LocalDateTime = f.minusMonths(monthsToSubtract)
  def minusWeeks(weeksToSubtract: Long): LocalDateTime = f.minusWeeks(weeksToSubtract)
  def minusDays(daysToSubtract: Long): LocalDateTime = f.minusDays(daysToSubtract)
  def minusHours(hoursToSubtract: Long): LocalDateTime = f.minusHours(hoursToSubtract)
  def minusMinutes(minutesToSubtract: Long): LocalDateTime = f.minusMinutes(minutesToSubtract)
  def minusSeconds(secondsToSubtract: Long): LocalDateTime = f.minusSeconds(secondsToSubtract)
  def minusNanos(nanosToSubtract: Long): LocalDateTime = f.minusNanos(nanosToSubtract)
//  def until(endExclusive: Temporal, unit: TemporalUnit): Long = js.native
//  def atZone(zone: ZoneId): ZonedDateTime = js.native
  def toLocalDate(): LocalDate = f.toLocalDate()
  def toLocalTime(): LocalTime = f.toLocalTime()
  def compareTo(other: LocalDateTime): Int = f.compareTo(other)
  def isAfter(other: LocalDateTime): Boolean = f.isAfter(other)
  def isBefore(other: LocalDateTime): Boolean = f.isBefore(other)
  def isEqual(other: LocalDateTime): Boolean = f.isEqual(other)
  def format(formatter: DateTimeFormatter): String = f.format(formatter)

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
