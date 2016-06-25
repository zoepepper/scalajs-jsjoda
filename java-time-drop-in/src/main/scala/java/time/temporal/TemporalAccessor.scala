package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{TemporalAccessor => TemporalAccessorF}

// TemporalAccessor is the most generic class, encompassing all Temporal and TemporalAdjuster classes.
// Therefore, it will be the one to keep the facade reference.
abstract class TemporalAccessor protected[time](protected[time] val f: TemporalAccessorF) {
  def get(field: TemporalField): Int = f.get(field).toInt
  def getLong(field: TemporalField): Long = f.get(field).toLong
  def isSupported(field: TemporalField): Boolean = f.isSupported(field)
//  def query[T](query: TemporalQuery[T]): T = f.query(query) We should wrap result
  def range(field: TemporalField): ValueRange = f.range(field)
}