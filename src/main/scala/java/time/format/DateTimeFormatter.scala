package java.time.format

import java.text.ParsePosition
import java.time.Period
import java.time.chrono.Chronology
import java.time.temporal.{TemporalAccessor, TemporalQuery}

/**
  * Created by rpiaggio on 22-Jun-16.
  */
@js.native
@JSName("JSJoda.DateTimeFormatter")
object DateTimeFormatter extends js.Object {
  def parsedExcessDays(): TemporalQuery[Period] = js.native
  def parsedLeapSecond(): Boolean = js.native
  def ofPattern(pattern: String): DateTimeFormatter = js.native

  val ISO_LOCAL_DATE: DateTimeFormatter = js.native
  val ISO_LOCAL_TIME: DateTimeFormatter = js.native
  val ISO_LOCAL_DATE_TIME: DateTimeFormatter = js.native
  val ISO_INSTANT: DateTimeFormatter = js.native
  val ISO_OFFSET_DATE_TIME: DateTimeFormatter = js.native
  val ISO_ZONED_DATE_TIME: DateTimeFormatter = js.native
  val PARSED_EXCESS_DAYS: DateTimeFormatter = js.native
  val PARSED_LEAP_SECOND: DateTimeFormatter = js.native
}

@js.native
class DateTimeFormatter extends js.Object {
  @JSName("decimalStyle") def getDecimalStyle(): DecimalStyle = js.native
  @JSName("chronology") def getChronology(): Chronology = js.native
  def withChronology(chrono: Chronology): DateTimeFormatter = js.native
  def format(temporal: TemporalAccessor): String = js.native
  def parse(text: String): TemporalAccessor = js.native
  def parse[T](text: String, query: TemporalQuery[T]): T = js.native
  def parseUnresolved(text: String, position: ParsePosition): TemporalAccessor = js.native

}
