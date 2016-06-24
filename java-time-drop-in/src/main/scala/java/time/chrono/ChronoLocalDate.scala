package java.time.chrono

import java.time.format.DateTimeFormatter

import com.zoepepper.facades.jsjoda.{LocalDate => LocalDateF}

import scala.language.implicitConversions
import scala.scalajs
import scala.scalajs.js

class ChronoLocalDate protected[time](protected[time] val f: LocalDateF) /*extends Temporal*/ {
  implicit def cld2ldf(cld: ChronoLocalDate): LocalDateF = cld.f

  //  def isSupported(field: TemporalField): Boolean = js.native
  //  def isSupported(unit: TemporalUnit): Boolean = js.native
//    def adjustInto(temporal: Temporal): Temporal = scalajs.js.native
  def compareTo(other: ChronoLocalDate): Int = f.compareTo(other)
  def isAfter(other: ChronoLocalDate): Boolean = f.isAfter(other)
  def isBefore(other: ChronoLocalDate): Boolean = f.isBefore(other)
  def isEqual(other: ChronoLocalDate): Boolean = f.isEqual(other)
  def format(formatter: DateTimeFormatter): String = f.format(formatter)
}
