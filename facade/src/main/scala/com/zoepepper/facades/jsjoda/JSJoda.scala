package com.zoepepper.facades.jsjoda

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait JSJoda extends js.Object {
  def use(plugin: JSJodaPlugin): JSJoda = js.native
}

@js.native
@JSGlobal("JSJoda")
object JSJoda extends JSJoda

@js.native
trait JSJodaPlugin extends js.Object

@js.native
@JSGlobal("JSJodaTimezone")
object JSJodaTimezone extends JSJodaPlugin
