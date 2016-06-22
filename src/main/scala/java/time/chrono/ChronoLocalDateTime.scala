package java.time.chrono

import java.time.temporal.Temporal
import java.time.{Instant, ZoneOffset}

@js.native
class ChronoLocalDateTime extends Temporal {
  @JSName("chronology") def getChronology(): Chronology = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native
  def toInstant(offset: ZoneOffset): Instant = js.native
  def toEpochSecond(offset: ZoneOffset): Long = js.native
}
