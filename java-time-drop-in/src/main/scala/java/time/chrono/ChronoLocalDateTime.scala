package java.time.chrono

import java.time.format.DateTimeFormatter

import com.zoepepper.facades.jsjoda.chrono.{ChronoLocalDateTime => ChronoLocalDateTimeF}
import java.time.{Instant, LocalDateTime, LocalTime, Wrapper, ZoneId, ZoneOffset, ZonedDateTime}
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalUnit}
import java.util.Comparator

object ChronoLocalDateTime {
  def from(temporal: TemporalAccessor): ChronoLocalDateTime[_] = ???
  def timeLineOrder(): Comparator[ChronoLocalDateTime[_]] = ???
}

trait ChronoLocalDateTime[D <: ChronoLocalDate] extends Comparable[ChronoLocalDateTime[_]] with Temporal with TemporalAdjuster {
  self: Wrapper =>
  protected[time] val chronoLocalDateF = self.f.asInstanceOf[ChronoLocalDateTimeF[_]]

  def atZone(zone: ZoneId): ZonedDateTime
  def compareTo(other: ChronoLocalDateTime[_]): Int
  def format(formatter: DateTimeFormatter): String
  def getChronology(): Chronology
  def isAfter(other: LocalDateTime): Boolean
  def isBefore(other: LocalDateTime): Boolean
  def isEqual(other: LocalDateTime): Boolean
  def isSupported(unit: TemporalUnit): Boolean
  def toEpochSecond(offset: ZoneOffset): Long
  def toInstant(offset: ZoneOffset): Instant
  def toLocalDate(): D
  def toLocalTime(): LocalTime
}
