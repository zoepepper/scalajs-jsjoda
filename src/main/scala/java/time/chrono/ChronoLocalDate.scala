package java.time.chrono

import java.time.format.DateTimeFormatter
import java.time.temporal.{Temporal, TemporalField, TemporalUnit}

@js.native
class ChronoLocalDate extends Temporal {
  def isSupported(field: TemporalField): Boolean = js.native
  def isSupported(unit: TemporalUnit): Boolean = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native
  def format(formatter: DateTimeFormatter): String = js.native
}
