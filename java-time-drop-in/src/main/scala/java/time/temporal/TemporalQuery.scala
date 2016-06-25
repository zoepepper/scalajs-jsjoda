package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{TemporalQuery => TemporalQueryF}

abstract class TemporalQuery[R] protected[time](protected[time] val f: TemporalQueryF[_]) {
  def queryFrom(temporal: TemporalAccessor): R

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}