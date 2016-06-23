package com.zoepepper.facades.jsjoda.temporal

import java.jsjoda
import java.time.chrono.Chronology
import java.time.temporal.TemporalUnit
import java.time.{temporal, _}

import com.zoepepper.facades

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("JSJoda.TemporalQueries")
@js.native
object TemporalQueries extends js.Object {
  def zoneId: TemporalQuery[ZoneId] = js.native
  def chronology: TemporalQuery[Chronology] = js.native
  def precision: TemporalQuery[TemporalUnit] = js.native
  def zone: TemporalQuery[ZoneId] = js.native
  def offset: TemporalQuery[ZoneOffset] = js.native
  def localDate: TemporalQuery[facades.jsjoda.LocalDate] = js.native
  def localTime: TemporalQuery[facades.jsjoda.LocalTime] = js.native
}