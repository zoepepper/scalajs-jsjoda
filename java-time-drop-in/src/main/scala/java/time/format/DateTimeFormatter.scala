package java.time.format

import com.zoepepper.facades.jsjoda.format.{DateTimeFormatter => DateTimeFormatterF}

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
  val PARSED_EXCESS_DAYS: DateTimeFormatter = DateTimeFormatterF.PARSED_EXCESS_DAYS
  val PARSED_LEAP_SECOND: DateTimeFormatter = DateTimeFormatterF.PARSED_LEAP_SECOND
}

class DateTimeFormatter protected[time](protected[time] val f: DateTimeFormatterF) {
//  def getDecimalStyle(): DecimalStyle = js.native
//  def getChronology(): Chronology = js.native
//  def withChronology(chrono: Chronology): DateTimeFormatter = js.native
//  def format(temporal: TemporalAccessor): String = js.native
//  def parse(text: String): TemporalAccessor = f.parse(text)
//  def parse[T](text: String, query: TemporalQuery[T]): T = js.native
//  def parseUnresolved(text: String, position: ParsePosition): TemporalAccessor = js.native

}
