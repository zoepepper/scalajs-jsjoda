package java.time.temporal

import java.time._

import com.zoepepper.facades.jsjoda.temporal.{TemporalAdjuster => TemporalAdjusterF}

trait TemporalAdjuster { self: Wrapper =>
  protected[time] val temporalAdjusterF = self.f.asInstanceOf[TemporalAdjusterF]

  def adjustInto(temporal: Temporal): Temporal = f2Temporal(temporalAdjusterF.adjustInto(temporal), temporal)
}
