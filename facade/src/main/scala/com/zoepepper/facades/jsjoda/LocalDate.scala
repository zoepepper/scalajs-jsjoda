package com.zoepepper.facades.jsjoda

import java.time.{Month, Period, ZoneId}
import java.time.chrono.Chronology
import java.time.temporal.{TemporalAdjuster, TemporalField, TemporalUnit}

import com.zoepepper.facades.jsjoda.chrono.ChronoLocalDate
import com.zoepepper.facades.jsjoda.temporal.{Temporal, TemporalAmount}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.LocalDate")
object LocalDate extends js.Object {
  def now(clock: Clock = ???): LocalDate = js.native
  def now(zone: ZoneId): LocalDate = js.native
  def ofInstant(instant: Instant, zone: ZoneId = ???): LocalDate = js.native
  def of(year: Int, month: Int, dayOfMonth: Int): LocalDate = js.native
  def of(year: Int, month: Month, dayOfMonth: Int): LocalDate = js.native
  def ofYearDay(year: Int, dayOfYear: Int): LocalDate = js.native
  def ofEpochDay(epochDay: Double = ???): LocalDate = js.native
  def from(temporal: Temporal): LocalDate = js.native
  def parse(text: String, formatter: format.DateTimeFormatter = ???): LocalDate = js.native

  val MAX: LocalDate = js.native
  val MIN: LocalDate = js.native
}

@js.native
class LocalDate private(year: Int, month: Int, dayOfMonth: Int) extends ChronoLocalDate {
  @JSName("year") def getYear(): Int = js.native
  @JSName("month") def getMonth(): Month = js.native
  @JSName("monthValue") def getMonthValue(): Int = js.native
  @JSName("dayOfMonth") def getDayOfMonth(): Int = js.native
  @JSName("dayOfYear") def getDayOfYear(): Int = js.native
  @JSName("dayOfWeek") def getDayOfWeek(): DayOfWeek = js.native
  def getLong(unit: TemporalUnit): Long = js.native
  @JSName("chronology") def getChronology(): Chronology = js.native
  def isLeapYear(): Boolean = js.native
  def lengthOfMonth(): Int = js.native
  def lengthOfYear(): Int = js.native
  def `with`(adjuster: TemporalAdjuster, newValue: Double): LocalDate = js.native
  def `with`(field: TemporalField, newValue: Double): LocalDate = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDate = js.native
  def withYear(year: Int): LocalDate = js.native
  def withMonth(month: Int): LocalDate = js.native
  def withDayOfMonth(dayOfMonth: Int): LocalDate = js.native
  def withDayOfYear(dayOfYear: Int): LocalDate = js.native
  def plus(amount: TemporalAmount): LocalDate = js.native
  def plus(amount: Double, unit: TemporalUnit): LocalDate = js.native
  def plusYears(yearsToAdd: Double): LocalDate = js.native
  def plusMonths(monthsToAdd: Double): LocalDate = js.native
  def plusWeeks(weeksToAdd: Double): LocalDate = js.native
  def plusDays(daysToAdd: Double): LocalDate = js.native
  def minus(amount: TemporalAmount): LocalDate = js.native
  def minus(amount: Double, unit: TemporalUnit): LocalDate = js.native
  def minusYears(yearsToSubtract: Double): LocalDate = js.native
  def minusMonths(monthsToSubtract: Double): LocalDate = js.native
  def minusWeeks(weeksToSubtract: Double): LocalDate = js.native
  def minusDays(daysToSubtract: Double): LocalDate = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): Long = js.native
  def until(endDate: ChronoLocalDate): Period = js.native
  def atTime(time: LocalTime): LocalDateTime = js.native
  def atTime(hour: Int, minute: Int, second: Int = ???, nanoOfSecond: Int = ???): LocalDateTime = js.native
  def atStartOfDay(zone: ZoneId = ???): LocalDateTime = js.native
  def toEpochDay(): Long = js.native
  def compareTo(other: LocalDate): Int = js.native
  def isAfter(other: LocalDate): Boolean = js.native
  def isBefore(other: LocalDate): Boolean = js.native
  def isEqual(other: LocalDate): Boolean = js.native
}
