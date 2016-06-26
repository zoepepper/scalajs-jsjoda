package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{Temporal => TemporalF}

abstract class Temporal protected[time](f: TemporalF) extends TemporalAccessor(f) {
  def minus(amountToSubtract: Long, unit: TemporalUnit): Temporal
  def minus(amount: TemporalAmount): Temporal
  def plus(amountToAdd: Long, unit: TemporalUnit): Temporal
  def plus(amount: TemporalAmount): Temporal
  def until(endExclusive: Temporal, unit: TemporalUnit): Long = f.until(endExclusive, unit).toLong
  def `with`(adjuster: TemporalAdjuster): Temporal
  def `with`(field: TemporalField, newValue: Long): Temporal
}