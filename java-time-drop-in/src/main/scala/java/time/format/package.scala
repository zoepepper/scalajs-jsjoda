package java.time

import com.zoepepper.facades.jsjoda.format.{DateTimeFormatter => DateTimeFormatterF}

import scala.language.implicitConversions

package object format {
  implicit def dtf2F(dtf: DateTimeFormatter): DateTimeFormatterF = dtf.f
  implicit def f2DTF(f: DateTimeFormatterF): DateTimeFormatter = new DateTimeFormatter(f)
}
