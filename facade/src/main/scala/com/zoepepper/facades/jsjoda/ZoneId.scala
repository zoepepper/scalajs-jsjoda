package com.zoepepper.facades.jsjoda

import com.zoepepper.facades.jsjoda.temporal.TemporalAccessor
import com.zoepepper.facades.jsjoda.zone.ZoneRules

import scala.scalajs.js.annotation.{JSGlobal, JSName}
import scalajs.js

@js.native
@JSGlobal("JSJoda.ZoneId")
object ZoneId extends js.Object {
  def systemDefault(): ZoneId = js.native
  def getAvailableZoneIds(): js.Array[String] = js.native
  def of(zoneId: String): ZoneId = js.native
  def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = js.native
  def from(temporal: TemporalAccessor): ZoneId = js.native

  val SYSTEM: ZoneId = js.native
  val UTC: ZoneId = js.native
}

@js.native
trait ZoneId extends js.Object {
  def id(): String = js.native
  def rules(): ZoneRules = js.native
  def normalized(): ZoneId = js.native
}
