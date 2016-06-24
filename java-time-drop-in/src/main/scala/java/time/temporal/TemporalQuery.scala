package java.time.temporal

trait TemporalQuery[R] {
  def queryFrom(temporal: TemporalAccessor): R
}