package java.time.temporal

import java.time.DayOfWeek
import java.{Wrapper, Wraps}

import com.zoepepper.facades.jsjoda.DayOfWeek
import com.zoepepper.facades.jsjoda.temporal.{TemporalAdjuster => TemporalAdjusterF}

trait TemporalAdjuster { self: Wrapper =>
  protected[time] val temporalAdjusterF = self.f.asInstanceOf[TemporalAdjusterF]

  def adjustInto(temporal: Temporal): Temporal = f2Temporal(temporalAdjusterF.adjustInto(temporal), temporal)
}

class TemporalAdjusterInstance protected[time](f: TemporalAdjusterF) extends Wraps(f) with TemporalAdjuster

