package com.zoepepper.facades.jsjoda.chrono

import java.time.chrono.Chronology
import java.time.ZoneOffset

import com.zoepepper.facades.jsjoda.Instant
import com.zoepepper.facades.jsjoda.temporal.Temporal

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
class ChronoLocalDateTime[D <: ChronoLocalDate] extends Temporal {
  @JSName("chronology") def getChronology(): Chronology = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native
  def toInstant(offset: ZoneOffset): Instant = js.native
  def toEpochSecond(offset: ZoneOffset): Long = js.native
}
