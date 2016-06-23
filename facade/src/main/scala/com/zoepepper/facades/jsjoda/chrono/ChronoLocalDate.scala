package com.zoepepper.facades.jsjoda.chrono

import java.jsjoda.format
import java.time.temporal.{TemporalField, TemporalUnit}

import com.zoepepper.facades.jsjoda.format.DateTimeFormatter
import com.zoepepper.facades.jsjoda.temporal.Temporal

import scala.scalajs.js

@js.native
class ChronoLocalDate extends Temporal {
  def isSupported(field: TemporalField): Boolean = js.native
  def isSupported(unit: TemporalUnit): Boolean = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native
  def format(formatter: DateTimeFormatter): String = js.native
}
