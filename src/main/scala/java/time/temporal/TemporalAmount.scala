package java.time.temporal

@js.native
class TemporalAmount extends js.Object {
  def get(unit: TemporalUnit): Double = js.native
  def getUnits: js.Array[TemporalUnit] = js.native
  def addTo(temporal: Temporal): Temporal = js.native
  def subtractFrom(temporal: Temporal): Temporal = js.native
}