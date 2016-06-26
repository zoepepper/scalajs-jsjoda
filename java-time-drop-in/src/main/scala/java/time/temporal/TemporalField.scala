package java.time.temporal

import java.time.format.ResolverStyle
import java.util.Locale

import com.zoepepper.facades.jsjoda.temporal.{ChronoField => ChronoFieldF}

class TemporalField protected[time](protected[time] val f: ChronoFieldF) {
  def range(): ValueRange = f.range
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange = f.rangeRefinedBy(temporal)
  def getFrom(temporal: TemporalAccessor): Long = f.getFrom(temporal)
  def isSupportedBy(temporal: TemporalAccessor): Boolean = f.isSupportedBy(temporal)
  def isDateBased(): Boolean = f.isDateBased
  def getRangeUnit(): TemporalUnit = f.rangeUnit
  def getBaseUnit(): TemporalUnit = f.baseUnit
  def isTimeBased(): Boolean = f.isTimeBased
  def adjustInto[R <: Temporal](temporal: R, newValue: Long): R = ???
  def getDisplayName(locale: Locale): String = ???
  def resolve(fieldValues: java.util.Map[TemporalField, Long], partialTemporal: TemporalAccessor,
              resolverStyle: ResolverStyle): TemporalAccessor = ???

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
