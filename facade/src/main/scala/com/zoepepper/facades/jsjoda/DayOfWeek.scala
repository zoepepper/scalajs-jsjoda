package com.zoepepper.facades.jsjoda

import java.time.temporal.{TemporalAdjusters, TemporalField}

import com.zoepepper.facades.jsjoda.temporal.{Temporal, TemporalAccessor}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.DayOfWeek")
object DayOfWeek extends js.Object {
  def values: js.Array[DayOfWeek] = js.native
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
class DayOfWeek extends temporal.Temporal {
  @JSName("value") def getValue(): Int = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def getLong(field: TemporalField): Long = js.native
  def plus(days: Double): DayOfWeek = js.native
  def minus(days: Double): DayOfWeek = js.native
  def adjustInto(temporal: TemporalAdjusters): Temporal = js.native
}
