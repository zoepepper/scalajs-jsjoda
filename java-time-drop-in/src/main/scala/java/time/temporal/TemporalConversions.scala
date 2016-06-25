package java.time.temporal

import java.time.chrono.HijrahDate
import java.time.{BaseConversions, Instant, LocalDate, LocalDateTime, LocalTime}

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
import com.zoepepper.facades.jsjoda.{Instant => InstantF}
import com.zoepepper.facades.jsjoda.{LocalDate => LocalDateF}
import com.zoepepper.facades.jsjoda.{LocalDateTime => LocalDateTimeF}
import com.zoepepper.facades.jsjoda.{LocalTime => LocalTimeF}

import scala.language.implicitConversions

trait TemporalConversions extends BaseConversions {
  implicit def chronoField2F(chronoField: ChronoField): ChronoFieldF = chronoField.f
  implicit def f2ChronoField(f: ChronoFieldF): ChronoField = new ChronoField(f)

  implicit def chronoUnit2F(chronoUnit: ChronoUnit): ChronoUnitF = chronoUnit.f
  implicit def f2ChronoUnit(f: ChronoUnitF): ChronoUnit = new ChronoUnit(f)

  implicit def temporal2F[R <: Temporal](temporal: R): TemporalF = temporal.f.asInstanceOf[TemporalF]
  def f2Temporal[R <: Temporal](f: TemporalF, target: R): Temporal = target.getClass match {
    // All known Temporal implementing classes.
    //    case c if c == classOf[HijrahDate] => f.asInstanceOf[HijrahDateF]
    case c if c == classOf[Instant] => f.asInstanceOf[InstantF]
    //    case c if c == classOf[JapaneseDate] => f.asInstanceOf[JapaneseDateF]
//    case c if c == classOf[LocalDate] => f.asInstanceOf[LocalDateF]
//    case c if c == classOf[LocalDateTime] => f.asInstanceOf[LocalDateTimeF]
//    case c if c == classOf[LocalTime] => f.asInstanceOf[LocalDateTimeF]
    //    case c if c == classOf[MinguoDate] => f.asInstanceOf[MinguoDateF]
    //    case c if c == classOf[OffsetDateTime] => f.asInstanceOf[OffsetDateTimeF]
    //    case c if c == classOf[OffsetTime] => f.asInstanceOf[OffsetTimeF]
    //    case c if c == classOf[ThaiBuddhistDate] => f.asInstanceOf[ThaiBuddhistDateF]
    //    case c if c == classOf[Year] => f.asInstanceOf[YearF]
    //    case c if c == classOf[YearMonth] => f.asInstanceOf[YearMonthF]
    //    case c if c == classOf[ZonedDateTime] => f.asInstanceOf[ZonedDateTimeF]
  }

  implicit def temporalAccessor2F(temporalAccessor: TemporalAccessor): TemporalAccessorF = temporalAccessor.f

  implicit def temporalAdjuster2F(temporalAdjuster: TemporalAdjuster): TemporalAdjusterF = temporalAdjuster.taf

  implicit def temporalAmount2F(temporalAmount: TemporalAmount): TemporalAmountF = temporalAmount.f.asInstanceOf[TemporalAmountF]

  implicit def temporalField2F(temporalField: TemporalField): TemporalFieldF = temporalField.f

  implicit def temporalQuery2F[R](temporalQuery: TemporalQuery[R]): TemporalQueryF[_] = temporalQuery.f

  implicit def temporalUnit2F(temporalUnit: TemporalUnit): TemporalUnitF = temporalUnit.f
  implicit def f2TemporalUnit(f: TemporalUnitF): TemporalUnit = new TemporalUnit(f.asInstanceOf[ChronoUnitF])

  implicit def valueRange2F(valueRange: ValueRange): ValueRangeF = valueRange.f
  implicit def f2ValueRange(f: ValueRangeF): ValueRange = new ValueRange(f)
}