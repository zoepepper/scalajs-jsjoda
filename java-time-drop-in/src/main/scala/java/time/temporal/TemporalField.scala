package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{TemporalField => TemporalFieldF}

abstract class TemporalField protected[temporal](protected[temporal] val f: TemporalFieldF) {
  def adjustInto[R <: Temporal](temporal: R, newValue: Long): R
  def getBaseUnit(): TemporalUnit
//  def getDisplayName(locale: Locale): String
  def getFrom(temporal: TemporalAccessor): Long
  def getRangeUnit(): TemporalUnit
  def isDateBased(): Boolean
  def isSupportedBy(temporal: TemporalAccessor): Boolean
  def isTimeBased(): Boolean
  def range(): ValueRange
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange
//  def resolve(fieldValues: java.util.Map[TemporalField, Long], partialTemporal: TemporalAccessor, resolverStyle: ResolverStyle): TemporalAccessor
  def toString(): String
}
