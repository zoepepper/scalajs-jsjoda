package java.time

import java.time.format.DateTimeFormatter

import scala.scalajs.js
import com.zoepepper.facades.jsjoda.{LocalTime => LocalTimeF}

object LocalTime {
  def now(): LocalTime = LocalTimeF.now()
  def now(clock: Clock): LocalTime = LocalTimeF.now(clock)
//  def now(zone: ZoneId): LocalTime = js.native
//  def ofInstant(instant: Instant, zone: ZoneId = ???): LocalTime = js.native
  def of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalTime = LocalTimeF.of(hour, minute, second, nanoOfSecond)
  def ofSecondOfDay(secondOfDay: Long): LocalTime = LocalTimeF.ofSecondOfDay(secondOfDay)
  def ofNanoOfDay(nanoOfDay: Long): LocalTime = LocalTimeF.ofNanoOfDay(nanoOfDay)
//  def from(temporal: Temporal): LocalTime = js.native
  def parse(text: String): LocalTime = LocalTimeF.parse(text)
  def parse(text: String, formatter: DateTimeFormatter): LocalTime = LocalTimeF.parse(text, formatter)

  val MAX: LocalDate = LocalTimeF.MAX
  val MIN: LocalDate = LocalTimeF.MIN
  val MIDNIGHT: LocalDate = LocalTimeF.MIDNIGHT
  val NOON: LocalDate = LocalTimeF.NOON
}

class LocalTime protected[time](protected[time] val f: LocalTimeF) /*extends temporal.Temporal*/ {
  def getHour(): Int = js.native
  def getMinute(): Int = js.native
  def getSecond(): Int = js.native
  def getNano(): Int = js.native
//  def isSupported(field: TemporalField): Boolean = js.native
//  def isSupported(unit: TemporalUnit): Boolean = js.native
//  def getLong(unit: TemporalUnit): Long = js.native
//  def `with`(adjuster: TemporalAdjuster, newValue: Double): LocalTime = js.native
//  def `with`(field: TemporalField, newValue: Double): LocalTime = js.native
//  def withTemporalAdjuster(adjuster: TemporalAdjuster): LocalTime = js.native
  def withHour(hour: Int): LocalTime = f.withHour(hour)
  def withMinute(minute: Int): LocalTime = f.withMinute(minute)
  def withSecond(second: Int): LocalTime = f.withSecond(second)
  def withNano(nano: Int): LocalTime = f.withNano(nano)
//  def truncatedTo(unit: TemporalUnit): LocalTime = js.native
//  def plus(amount: temporal.TemporalAmount): LocalTime = js.native
//  def plus(amount: Long, unit: TemporalUnit): LocalTime = js.native
  def plusHours(hoursToAdd: Long): LocalTime = f.plusHours(hoursToAdd)
  def plusMinutes(minutesToAdd: Long): LocalTime = f.plusMinutes(minutesToAdd)
  def plusSeconds(secondsToAdd: Long): LocalTime = f.plusSeconds(secondsToAdd)
  def plusNanos(nanosToAdd: Long): LocalTime = f.plusNanos(nanosToAdd)
//  def minus(amount: TemporalAmount): LocalTime = js.native
//  def minus(amount: Long, unit: TemporalUnit): LocalTime = js.native
  def minusHours(hoursToSubtract: Long): LocalTime = f.minusHours(hoursToSubtract)
  def minusMinutes(minutesToSubtract: Long): LocalTime = f.minusMinutes(minutesToSubtract)
  def minusSeconds(secondsToSubtract: Long): LocalTime = f.minusSeconds(secondsToSubtract)
  def minusNanos(nanosToSubtract: Long): LocalTime = f.minusNanos(nanosToSubtract)
//  def adjustInto(temporal: Temporal): Temporal = js.native
//  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
//  def atDate(date: LocalDate): LocalDateTime = js.native
  def toSecondOfDay(): Int = f.toSecondOfDay()
  def toNanoOfDay(): Long = f.toNanoOfDay()
  def compareTo(other: LocalTime): Int = f.compareTo(other)
  def isAfter(other: LocalTime): Boolean = f.isAfter(other)
  def isBefore(other: LocalTime): Boolean = f.isBefore(other)
  def format(formatter: DateTimeFormatter): String = f.format(formatter)

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
