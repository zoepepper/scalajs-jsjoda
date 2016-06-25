package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{TemporalAccessor => TemporalAccessorF}

abstract class TemporalAccessor protected[time](protected[time] val f: TemporalAccessorF) {
  def get(field: TemporalField): Int = f.get(field).toInt
  def getLong(field: TemporalField): Long = f.get(field).toLong
  def isSupported(field: TemporalField): Boolean = f.isSupported(field)
//  def query[T](query: TemporalQuery[T]): T = f.query(query) We should wrap result
  def range(field: TemporalField): ValueRange = f.range(field)
}