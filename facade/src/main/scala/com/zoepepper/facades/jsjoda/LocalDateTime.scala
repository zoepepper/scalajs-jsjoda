package com.zoepepper.facades.jsjoda

import java.time
import java.time.{Instant, _}
import java.time.chrono.ChronoLocalDate
import java.time.temporal._

import com.zoepepper.facades.jsjoda.chrono.ChronoLocalDateTime
import com.zoepepper.facades.jsjoda.format.DateTimeFormatter

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.LocalDateTime")
object LocalDateTime extends js.Object {
  def now(clock: Clock = ???): LocalDateTime = js.native
  def now(zone: ZoneId): LocalDateTime = js.native
  def ofInstant(instant: Instant, zone: ZoneId = ???): LocalDateTime = js.native
  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int = ???, nanoOfSecond: Int = ???): LocalDateTime = js.native
  def of(year: Int, month: Month, dayOfMonth: Int): LocalDateTime = js.native
  def of(year: Int, month: Month, dayOfMonth: Int, second: Int): LocalDateTime = js.native
  def of(year: Int, month: Month, dayOfMonth: Int, second: Int, nanoOfSecond: Int): LocalDateTime = js.native
  def of(date: LocalDate, time: LocalTime): LocalDateTime = js.native
  def ofEpochSecond(epochSecond: Double, nanoOfSecond: Int, offset: ZoneOffset): LocalDateTime = js.native
  def from(temporal: temporal.Temporal): LocalDateTime = js.native
  def parse(text: String, formatter: DateTimeFormatter = ???): LocalDateTime = js.native

  val MAX: LocalDateTime = js.native
  val MIN: LocalDateTime = js.native
}

@js.native
class LocalDateTime private(date: LocalDate, time: LocalTime) extends ChronoLocalDateTime[chrono.ChronoLocalDate] {
  @JSName("year") def getYear(): Int = js.native
  @JSName("month") def getMonth(): Month = js.native
  @JSName("monthValue") def getMonthValue(): Int = js.native
  @JSName("dayOfMonth") def getDayOfMonth(): Int = js.native
  @JSName("dayOfYear") def getDayOfYear(): Int = js.native
  @JSName("dayOfWeek") def getDayOfWeek(): DayOfWeek = js.native
  @JSName("hour") def getHour(): Int = js.native
  @JSName("minute") def getMinute(): Int = js.native
  @JSName("second") def getSecond(): Int = js.native
  @JSName("nano") def getNano(): Int = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def isSupported(unit: TemporalUnit): Boolean = js.native
  def getLong(unit: TemporalUnit): Long = js.native
  def `with`(adjuster: TemporalAdjuster, newValue: Double): LocalDateTime = js.native
  def `with`(field: TemporalField, newValue: Double): LocalDateTime = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDateTime = js.native
  def withFieldAndValue(field: TemporalField, value: Double): LocalDateTime = js.native
  def withYear(year: Int): LocalDateTime = js.native
  def withMonth(month: Int): LocalDateTime = js.native
  def withDayOfMonth(dayOfMonth: Int): LocalDateTime = js.native
  def withDayOfYear(dayOfYear: Int): LocalDateTime = js.native
  def withHour(hour: Int): LocalDateTime = js.native
  def withMinute(minute: Int): LocalDateTime = js.native
  def withSecond(second: Int): LocalDateTime = js.native
  def withNano(nanoOfSecond: Int): LocalDateTime = js.native
  def truncatedTo(unit: TemporalUnit): LocalDateTime = js.native
  def plus(amount: temporal.TemporalAmount): LocalDateTime = js.native
  def plus(amount: Double, unit: TemporalUnit): LocalDateTime = js.native
  def plusYears(yearsToAdd: Double): LocalDateTime = js.native
  def plusMonths(monthsToAdd: Double): LocalDateTime = js.native
  def plusWeeks(weeksToAdd: Double): LocalDateTime = js.native
  def plusDays(daysToAdd: Double): LocalDateTime = js.native
  def plusHours(hoursToAdd: Double): LocalDateTime = js.native
  def plusMinutes(minutesToAdd: Double): LocalDateTime = js.native
  def plusSeconds(secondsToAdd: Double): LocalDateTime = js.native
  def plusNanos(nanosToAdd: Double): LocalDateTime = js.native
  def minus(amount: temporal.TemporalAmount): LocalDateTime = js.native
  def minus(amount: Double, unit: TemporalUnit): LocalDateTime = js.native
  def minusYears(yearsToSubtract: Double): LocalDateTime = js.native
  def minusMonths(monthsToSubtract: Double): LocalDateTime = js.native
  def minusWeeks(weeksToSubtract: Double): LocalDateTime = js.native
  def minusDays(daysToSubtract: Double): LocalDateTime = js.native
  def minusHours(hoursToSubtract: Double): LocalDateTime = js.native
  def minusMinutes(minutesToSubtract: Double): LocalDateTime = js.native
  def minusSeconds(secondsToSubtract: Double): LocalDateTime = js.native
  def minusNanos(nanosToSubtract: Double): LocalDateTime = js.native
  def until(endExclusive: temporal.Temporal, unit: TemporalUnit): Long = js.native
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  def toLocalDate(): LocalDate = js.native
  def toLocalTime(): LocalTime = js.native
  def compareTo(other: LocalDateTime): Int = js.native
  def isAfter(other: LocalDateTime): Boolean = js.native
  def isBefore(other: LocalDateTime): Boolean = js.native
  def isEqual(other: LocalDateTime): Boolean = js.native
  def format(formatter: DateTimeFormatter): String = js.native
}
