package java.time

import com.zoepepper.facades.jsjoda.{DayOfWeek => DayOfWeekF}

object DayOfWeek {
  def values: Array[DayOfWeek] = DayOfWeekF.values
  def valueOf(name: String): DayOfWeek = DayOfWeekF.valueOf(name)
  def of(dayOfWeek: Int): DayOfWeek = DayOfWeekF.of(dayOfWeek)
//  def from(temporal: TemporalAccessor): DayOfWeek = js.native

  val MONDAY: DayOfWeek = DayOfWeekF.MONDAY
  val TUESDAY: DayOfWeek = DayOfWeekF.TUESDAY
  val WEDNESDAY: DayOfWeek = DayOfWeekF.WEDNESDAY
  val THURSDAY: DayOfWeek = DayOfWeekF.THURSDAY
  val FRIDAY: DayOfWeek = DayOfWeekF.FRIDAY
  val SATURDAY: DayOfWeek = DayOfWeekF.SATURDAY
  val SUNDAY: DayOfWeek = DayOfWeekF.SUNDAY
}

class DayOfWeek protected[time](protected[time] val f: DayOfWeekF) /*extends temporal.Temporal*/ {
  def getValue(): Int = f.getValue()
//  def isSupported(field: TemporalField): Boolean = scalajs.js.native
//  def getLong(field: TemporalField): Long = scalajs.js.native
  def plus(days: Long): DayOfWeek = f.plus(days)
  def minus(days: Long): DayOfWeek = f.minus(days)
//  def adjustInto(temporal: TemporalAdjusters): Temporal = js.native

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
