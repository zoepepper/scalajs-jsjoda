package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{TemporalAmount => TemporalAmountF}

abstract class TemporalAmount protected[time](protected[time] val f: TemporalAmountF) {
  def addTo(temporal: Temporal): Temporal
  def get(unit: TemporalUnit): Long = f.get(unit).toLong
  def getUnits: java.util.List[TemporalUnit] = f.getUnits
  def subtractFrom(temporal: Temporal): Temporal
}