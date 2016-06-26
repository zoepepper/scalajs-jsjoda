package com.zoepepper.facades.jsjoda.chrono

import com.zoepepper.facades.jsjoda.{Instant, ZoneOffset}
import com.zoepepper.facades.jsjoda.temporal.Temporal

import scala.scalajs.js

@js.native
trait ChronoLocalDateTime[D <: ChronoLocalDate] extends Temporal {
//  def chronology: Chronology
  def adjustInto(temporal: Temporal): Temporal
  def toInstant(offset: ZoneOffset): Instant
  def toEpochSecond(offset: ZoneOffset): Long
}
