package com.zoepepper.facades.jsjoda

import scalajs.js
import scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSJoda.Clock")
object Clock extends js.Object {
  def systemUTC(): Clock = js.native
  def systemDefaultZone(): Clock = js.native
  def system(zone: ZoneId): Clock = js.native
  def fixed(fixedInstant: Instant, zoneOffset: ZoneOffset): Clock = js.native
}

@js.native
@JSGlobal("JSJoda.Clock")
class Clock protected[jsjoda]() extends js.Object {
  def millis(): Double = js.native
  def instant(): Instant = js.native
  def zone(): ZoneId = js.native
}
