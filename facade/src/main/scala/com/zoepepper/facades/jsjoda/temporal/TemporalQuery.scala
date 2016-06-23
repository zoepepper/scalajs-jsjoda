package com.zoepepper.facades.jsjoda.temporal

import java.time.temporal
import java.time.temporal.TemporalAccessor

import com.zoepepper.facades.jsjoda.Enum

import scala.scalajs.js

@js.native
class TemporalQuery[T] extends Enum {
  def queryFrom(temporal: TemporalAccessor): T = js.native
}