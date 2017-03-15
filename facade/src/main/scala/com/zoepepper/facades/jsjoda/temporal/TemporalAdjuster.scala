package com.zoepepper.facades.jsjoda.temporal

import scalajs.js

@js.native
trait TemporalAdjuster extends js.Object {
  def adjustInto(temporal: Temporal): Temporal = js.native
}
