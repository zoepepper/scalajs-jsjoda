package com.zoepepper.facades.jsjoda

import com.zoepepper.facades.jsjoda.zone.ZoneRules

import scalajs.js

@js.native
trait ZoneId extends js.Object {
  def rules(): ZoneRules = js.native
  def normalized(): ZoneId = js.native

  override def toString(): String = js.native
  override def hashCode(): Int = js.native
  override def equals(obj: Any): Boolean = js.native
}
