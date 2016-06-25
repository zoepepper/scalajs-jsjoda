package com.zoepepper.facades.jsjoda

import com.zoepepper.facades.jsjoda.zone.ZoneRules

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.ZoneId")
object ZoneId extends js.Object {

}

@js.native
trait ZoneId extends js.Object {
  def rules: ZoneRules
}
