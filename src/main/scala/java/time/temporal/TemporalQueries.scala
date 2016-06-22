package java.time.temporal

import java.time.chrono.Chronology
import java.time.{LocalDate, LocalTime, ZoneId, ZoneOffset}

@JSName("JSJoda.TemporalQueries")
@js.native
object TemporalQueries extends js.Object {
  def zoneId: TemporalQuery[ZoneId] = js.native
  def chronology: TemporalQuery[Chronology] = js.native
  def precision: TemporalQuery[TemporalUnit] = js.native
  def zone: TemporalQuery[ZoneId] = js.native
  def offset: TemporalQuery[ZoneOffset] = js.native
  def localDate: TemporalQuery[LocalDate] = js.native
  def localTime: TemporalQuery[LocalTime] = js.native
}