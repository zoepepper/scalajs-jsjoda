package java.time.temporal

@js.native
class TemporalAccessor extends js.Object {
  def query[T](query: TemporalQuery[T]): T = js.native
  def get(field: TemporalField): Double = js.native
  def range(field: TemporalField): ValueRange = js.native
}