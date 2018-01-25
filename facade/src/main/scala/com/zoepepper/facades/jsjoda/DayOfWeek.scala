package com.zoepepper.facades.jsjoda

import com.zoepepper.facades.jsjoda.temporal.{Temporal, TemporalAccessor}

import scalajs.js
import scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSJoda.DayOfWeek")
object DayOfWeek extends js.Object {
  def values(): js.Array[DayOfWeek] = js.native
  def valueOf(name: String): DayOfWeek = js.native
  def of(dayOfWeek: Int): DayOfWeek = js.native
  def from(temporal: TemporalAccessor): DayOfWeek = js.native

  val MONDAY: DayOfWeek = js.native
  val TUESDAY: DayOfWeek = js.native
  val WEDNESDAY: DayOfWeek = js.native
  val THURSDAY: DayOfWeek = js.native
  val FRIDAY: DayOfWeek = js.native
  val SATURDAY: DayOfWeek = js.native
  val SUNDAY: DayOfWeek = js.native
}

@js.native
class DayOfWeek protected[jsjoda]() extends TemporalAccessor {
  def value(): Int = js.native
  def plus(days: Double): DayOfWeek = js.native
  def minus(days: Double): DayOfWeek = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native

  override def toString(): String = js.native
  override def equals(obj: Any): Boolean = js.native
}
