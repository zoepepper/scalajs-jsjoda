package java.time.format

import com.zoepepper.facades.jsjoda.format.{DateTimeFormatter => DateTimeFormatterF}
import com.zoepepper.facades.jsjoda.format.{ResolverStyle => ResolverStyleF}

import scala.language.implicitConversions

trait FormatConversions {
  implicit def dtf2F(dtf: DateTimeFormatter): DateTimeFormatterF = dtf.f
  implicit def f2DTF(f: DateTimeFormatterF): DateTimeFormatter = new DateTimeFormatter(f)

  implicit def f2DTF(f: ResolverStyleF): ResolverStyle = new ResolverStyle(f)
}
