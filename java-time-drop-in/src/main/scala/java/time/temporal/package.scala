package java.time

import com.zoepepper.facades.jsjoda.temporal.{TemporalField => TemporalFieldF}
import com.zoepepper.facades.jsjoda.temporal.{ValueRange => ValueRangeF}

import scala.language.implicitConversions

package object temporal {
  implicit def temporalField2F(temporalField: TemporalField): TemporalFieldF = temporalField.f
//  implicit def f2TemporalField(f: TemporalFieldF): TemporalField = new TemporalField(f)
  // We will convert back with specific ChronoField

  implicit def valueRange2F(valueRange: ValueRange): ValueRangeF = valueRange.f
  implicit def f2ValueRange(f: ValueRangeF): ValueRange = new ValueRange(f)
}
