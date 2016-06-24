package java

import com.zoepepper.facades.jsjoda.{Clock => ClockF}
import com.zoepepper.facades.jsjoda.{DayOfWeek => DayOfWeekF}
import com.zoepepper.facades.jsjoda.{Duration => DurationF}
import com.zoepepper.facades.jsjoda.{Instant => InstantF}
import com.zoepepper.facades.jsjoda.{LocalDate => LocalDateF}
import com.zoepepper.facades.jsjoda.{LocalDateTime => LocalDateTimeF}
import com.zoepepper.facades.jsjoda.{LocalTime => LocalTimeF}

import scala.language.implicitConversions
import scala.reflect.ClassTag
import scala.scalajs.js

package object time {
  implicit def clock2F(clock: Clock): ClockF = clock.f
  implicit def f2Clock(f: ClockF): Clock = new Clock(f)

  implicit def dayOfWeek2F(dayOfWeek: DayOfWeek): DayOfWeekF = dayOfWeek.f
  implicit def f2DayOfWeek(f: DayOfWeekF): DayOfWeek = new DayOfWeek(f)

  implicit def duration2F(duration: Duration): DurationF = duration.f
  implicit def f2Duration(f: DurationF): Duration = new Duration(f)

  implicit def instant2F(instant: Instant): InstantF = instant.f
  implicit def f2Instant(f: InstantF): Instant = new Instant(f)

  implicit def localDate2F(localDate: LocalDate): LocalDateF = localDate.f
  implicit def f2LocalDate(f: LocalDateF): LocalDate = new LocalDate(f)

  implicit def localDateTime2F(localDateTime: LocalDateTime): LocalDateTimeF = localDateTime.f
  implicit def f2LocalDateTime(f: LocalDateTimeF): LocalDateTime = new LocalDateTime(f)

  implicit def localTime2F(localTime: LocalTime): LocalTimeF = localTime.f
  implicit def f2LocalTime(f: LocalTimeF): LocalTime = new LocalTime(f)

  implicit def jsArrayF2scalaArray[B : ClassTag, A](a: scalajs.js.Array[A])(implicit ev: A => B): Array[B] =
    a.map(ev).toArray
}
