package java.time

import java.time.chrono.ChronoLocalDate
import java.time.format.DateTimeFormatter

import com.zoepepper.facades.jsjoda.{LocalDate => LocalDateF}

object LocalDate {
  def now(): LocalDate = LocalDateF.now()
  def now(clock: Clock): LocalDate = LocalDateF.now(clock)
//  def now(zone: ZoneId): LocalDate = js.native
//  def ofInstant(instant: Instant, zone: ZoneId = ???): LocalDate = js.native
  def of(year: Int, month: Int, dayOfMonth: Int): LocalDate = LocalDateF.of(year, month, dayOfMonth)
//  def of(year: Int, month: Month, dayOfMonth: Int): LocalDate = js.native
  def ofYearDay(year: Int, dayOfYear: Int): LocalDate = LocalDateF.ofYearDay(year, dayOfYear)
  def ofEpochDay(epochDay: Double = ???): LocalDate = LocalDateF.ofEpochDay(epochDay)
//  def from(temporal: Temporal): LocalDate = js.native
  def parse(text: CharSequence): LocalDate = LocalDateF.parse(text.toString)
  def parse(text: CharSequence, formatter: DateTimeFormatter): LocalDate = LocalDateF.parse(text.toString, formatter)

  val MAX: LocalDate = LocalDateF.MAX
  val MIN: LocalDate = LocalDateF.MIN
}

class LocalDate protected[time](f: LocalDateF) extends ChronoLocalDate(f) {
  def getYear(): Int = f.getYear()
//  def getMonth(): Month = f.getMonth()
  def getMonthValue(): Int = f.getMonthValue()
  def getDayOfMonth(): Int = f.getDayOfMonth()
  def getDayOfYear(): Int = f.getDayOfYear()
  def getDayOfWeek(): DayOfWeek = f.getDayOfWeek()
//  def getLong(unit: TemporalUnit): Long = js.native
//  def getChronology(): Chronology = js.native
  def isLeapYear(): Boolean = f.isLeapYear()
  def lengthOfMonth(): Int = f.lengthOfMonth()
  def lengthOfYear(): Int = f.lengthOfYear()
//  def `with`(adjuster: TemporalAdjuster, newValue: Double): LocalDate = js.native
//  def `with`(field: TemporalField, newValue: Double): LocalDate = js.native
//  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalDate = js.native
  def withYear(year: Int): LocalDate = f.withYear(year)
  def withMonth(month: Int): LocalDate = f.withMonth(month)
  def withDayOfMonth(dayOfMonth: Int): LocalDate = f.withDayOfMonth(dayOfMonth)
  def withDayOfYear(dayOfYear: Int): LocalDate = f.withDayOfYear(dayOfYear)
//  def plus(amount: TemporalAmount): LocalDate = js.native
//  def plus(amount: Double, unit: TemporalUnit): LocalDate = js.native
  def plusYears(yearsToAdd: Double): LocalDate = f.plusYears(yearsToAdd)
  def plusMonths(monthsToAdd: Double): LocalDate = f.plusMonths(monthsToAdd)
  def plusWeeks(weeksToAdd: Double): LocalDate = f.plusWeeks(weeksToAdd)
  def plusDays(daysToAdd: Double): LocalDate = f.plusDays(daysToAdd)
//  def minus(amount: TemporalAmount): LocalDate = js.native
//  def minus(amount: Double, unit: TemporalUnit): LocalDate = js.native
  def minusYears(yearsToSubtract: Double): LocalDate = f.minusYears(yearsToSubtract)
  def minusMonths(monthsToSubtract: Double): LocalDate = f.minusMonths(monthsToSubtract)
  def minusWeeks(weeksToSubtract: Double): LocalDate = f.minusWeeks(weeksToSubtract)
  def minusDays(daysToSubtract: Double): LocalDate = f.minusDays(daysToSubtract)
//  def until(endExclusive: Temporal, unit: TemporalUnit): Long = js.native
//  def until(endDate: ChronoLocalDate): Period = js.native
//  def atTime(time: LocalTime): LocalDateTime = js.native
//  def atTime(hour: Int, minute: Int, second: Int = ???, nanoOfSecond: Int = ???): LocalDateTime = js.native
//  def atStartOfDay(zone: ZoneId = ???): LocalDateTime = js.native
  def toEpochDay(): Long = f.toEpochDay()

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
