package java.time.temporal

import java.time.DayOfWeek

import com.zoepepper.facades.jsjoda.temporal.{TemporalAdjusters => TemporalAdjustersF}

object TemporalAdjusters {
  def firstDayOfMonth(): TemporalAdjuster = TemporalAdjustersF.firstDayOfMonth()
  def lastDayOfMonth(): TemporalAdjuster = TemporalAdjustersF.lastDayOfMonth()
  def firstDayOfNextMonth(): TemporalAdjuster = TemporalAdjustersF.firstDayOfNextMonth()
  def firstDayOfYear(): TemporalAdjuster = TemporalAdjustersF.firstDayOfYear()
  def lastDayOfYear(): TemporalAdjuster = TemporalAdjustersF.lastDayOfYear()
  def firstDayOfNextYear(): TemporalAdjuster = TemporalAdjustersF.firstDayOfNextYear()
  def firstInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.firstInMonth(dayOfWeek)
  def lastInMonth(dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.lastInMonth(dayOfWeek)
  def dayOfWeekInMonth(ordinal: Int, dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.dayOfWeekInMonth(ordinal, dayOfWeek)
  def next(dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.next(dayOfWeek)
  def nextOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.nextOrSame(dayOfWeek)
  def previous(dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.previous(dayOfWeek)
  def previousOrSame(dayOfWeek: DayOfWeek): TemporalAdjuster = TemporalAdjustersF.previousOrSame(dayOfWeek)
}
