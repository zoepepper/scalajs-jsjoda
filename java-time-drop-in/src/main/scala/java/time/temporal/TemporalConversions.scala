package java.time.temporal

import com.zoepepper.facades.jsjoda.temporal.{ChronoField => ChronoFieldF}
import com.zoepepper.facades.jsjoda.temporal.{ChronoUnit => ChronoUnitF}
import com.zoepepper.facades.jsjoda.temporal.{Temporal => TemporalF}
import com.zoepepper.facades.jsjoda.temporal.{TemporalAccessor => TemporalAccessorF}
import com.zoepepper.facades.jsjoda.temporal.{TemporalAdjuster => TemporalAdjusterF}
import com.zoepepper.facades.jsjoda.temporal.{TemporalAmount => TemporalAmountF}
import com.zoepepper.facades.jsjoda.temporal.{TemporalField => TemporalFieldF}
import com.zoepepper.facades.jsjoda.temporal.{TemporalQuery => TemporalQueryF}
import com.zoepepper.facades.jsjoda.temporal.{TemporalUnit => TemporalUnitF}
import com.zoepepper.facades.jsjoda.temporal.{ValueRange => ValueRangeF}

import scala.language.implicitConversions

trait TemporalConversions {
  implicit def chronoField2F(chronoField: ChronoField): ChronoFieldF = chronoField.f
  implicit def f2ChronoField(f: ChronoFieldF): ChronoField = new ChronoField(f)

  implicit def chronoUnit2F(chronoUnit: ChronoUnit): ChronoUnitF = chronoUnit.f
  implicit def f2ChronoUnit(f: ChronoUnitF): ChronoUnit = new ChronoUnit(f)

  implicit def temporal2F[R <: Temporal](temporal: R): TemporalF = temporal.f.asInstanceOf[TemporalF]

  implicit def temporalAccessor2F(temporalAccessor: TemporalAccessor): TemporalAccessorF = temporalAccessor.f

//  implicit def temporalAdjuster2F(temporalAdjuster: TemporalAdjuster): TemporalAdjusterF = temporalAdjuster.f.asInstanceOf[TemporalAdjusterF]

  implicit def temporalAmount2F(temporalAmount: TemporalAmount): TemporalAmountF = temporalAmount.f.asInstanceOf[TemporalAmountF]

  implicit def temporalField2F(temporalField: TemporalField): TemporalFieldF = temporalField.f

  implicit def temporalQuery2F[R](temporalQuery: TemporalQuery[R]): TemporalQueryF[_] = temporalQuery.f

  implicit def temporalUnit2F(temporalUnit: TemporalUnit): TemporalUnitF = temporalUnit.f
  implicit def f2TemporalUnit(f: TemporalUnitF): TemporalUnit = new TemporalUnit(f.asInstanceOf[ChronoUnitF])

  implicit def valueRange2F(valueRange: ValueRange): ValueRangeF = valueRange.f
  implicit def f2ValueRange(f: ValueRangeF): ValueRange = new ValueRange(f)
}
