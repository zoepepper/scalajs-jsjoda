package com.zoepepper.facades.jsjoda.temporal

import com.zoepepper.facades.jsjoda.DayOfWeek

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.TemporalAdjusters")
object TemporalAdjusters extends js.Object {
  def firstDayOfMonth(): TemporalAdjuster = js.native
  def lastDayOfMonth(): TemporalAdjuster = js.native
  def firstDayOfNextMonth(): TemporalAdjuster = js.native
  def firstDayOfYear(): TemporalAdjuster = js.native
  def lastDayOfYear(): TemporalAdjuster = js.native
  def firstDayOfNextYear(): TemporalAdjuster = js.native
  def firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def dayOfWeekInMonth(ordinal: Int, dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def next(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def previous(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
  def previousOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = js.native
}

@js.native
class TemporalAdjusters extends js.Object {
  def adjustInto(temporal: Temporal): Temporal = js.native
}
