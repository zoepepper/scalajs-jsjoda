package java.time.temporal

import java.time.Enum

@js.native
class TemporalQuery[T] extends Enum {
  def queryFrom(temporal: TemporalAccessor): T = js.native
}