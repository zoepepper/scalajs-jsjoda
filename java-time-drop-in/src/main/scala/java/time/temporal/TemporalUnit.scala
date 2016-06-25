package java.time.temporal

import java.time.Duration

import com.zoepepper.facades.jsjoda.temporal.{ChronoUnit => ChronoUnitF}

class TemporalUnit protected[time](protected[time] val f: ChronoUnitF) {
  def addTo[R <: Temporal](temporal: R, amount: Long): R = f.addTo(temporal, amount).asInstanceOf[R]
  def isDateBased(): Boolean = f.isDateBased
  def isDurationEstimated(): Boolean = f.isDurationEstimated
  def between(temporal1Inclusive: Temporal, temporal2Exclusive: Temporal): Long = f.between(temporal1Inclusive, temporal2Exclusive).toLong
  def isTimeBased(): Boolean = f.isTimeBased
  def getDuration(): Duration = f.getDuration
  def isSupportedBy(temporal: Temporal): Boolean = f.isSupportedBy(temporal)

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
