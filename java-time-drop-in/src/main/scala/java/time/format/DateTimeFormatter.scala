package java.time.format

import java.time.Wraps
import java.time.chrono.Chronology
import java.time.temporal.TemporalAccessor

import com.zoepepper.facades.jsjoda.format.{DateTimeFormatter => DateTimeFormatterF}

import scalajs.js

object DateTimeFormatter {
  //  def parsedExcessDays(): TemporalQuery[Period] = js.native
  def parsedLeapSecond(): Boolean = DateTimeFormatterF.parsedLeapSecond()
  def ofPattern(pattern: String): DateTimeFormatter = DateTimeFormatterF.ofPattern(pattern)

  val ISO_LOCAL_DATE: DateTimeFormatter = DateTimeFormatterF.ISO_LOCAL_DATE
  val ISO_LOCAL_TIME: DateTimeFormatter = DateTimeFormatterF.ISO_LOCAL_TIME
  val ISO_LOCAL_DATE_TIME: DateTimeFormatter = DateTimeFormatterF.ISO_LOCAL_DATE_TIME
  val ISO_INSTANT: DateTimeFormatter = DateTimeFormatterF.ISO_INSTANT
  val ISO_OFFSET_DATE_TIME: DateTimeFormatter = DateTimeFormatterF.ISO_OFFSET_DATE_TIME
  val ISO_ZONED_DATE_TIME: DateTimeFormatter = DateTimeFormatterF.ISO_ZONED_DATE_TIME

  val BASIC_ISO_DATE: DateTimeFormatter = ???
  val ISO_DATE: DateTimeFormatter = ???
  val ISO_DATE_TIME: DateTimeFormatter = ???
  val ISO_OFFSET_DATE: DateTimeFormatter = ???
  val ISO_OFFSET_TIME: DateTimeFormatter = ???
  val ISO_ORDINAL_DATE: DateTimeFormatter = ???
  val ISO_TIME: DateTimeFormatter = ???
  val RFC_1123_DATE_TIME: DateTimeFormatter = ???
}

class DateTimeFormatter protected[time](f: DateTimeFormatterF) extends Wraps(f) {
  def format(temporal: TemporalAccessor): String = f.format(temporal)
  def formatTo(temporal: TemporalAccessor, appendable: Appendable): Unit = ???
  def getChronology(): Chronology = f.chronology



  //  def getDecimalStyle(): DecimalStyle = js.native
  //  def getChronology(): Chronology = js.native
  //  def withChronology(chrono: Chronology): DateTimeFormatter = js.native

  //  def parse(text: String): TemporalAccessor = f.parse(text)
  //  def parse[T](text: String, query: TemporalQuery[T]): T = js.native
  //  def parseUnresolved(text: String, position: ParsePosition): TemporalAccessor = js.native

}
