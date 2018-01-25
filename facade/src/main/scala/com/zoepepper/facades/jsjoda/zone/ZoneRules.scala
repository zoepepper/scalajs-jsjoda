package com.zoepepper.facades.jsjoda.zone

import com.zoepepper.facades.jsjoda._

import scalajs.js
import scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSJoda.ZoneRules")
object ZoneRules extends js.Object {
  def of(offset: ZoneOffset): ZoneRules = js.native
}

@js.native
trait ZoneRules extends js.Object {
  def isFixedOffset(): Boolean = js.native
  def offset(instant: Instant): ZoneOffset = js.native
  def offset(localDateTime: LocalDateTime): ZoneOffset = js.native
  def validOffsets(localDateTime: LocalDateTime): js.Array[ZoneOffset] = js.native
  def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = js.native
  def transition(localDateTime: LocalDateTime): ZoneOffsetTransition = js.native
  def standardOffset(instant: Instant): ZoneOffset = js.native
  def daylightSavings(instant: Instant): Duration = js.native
  def isDaylightSavings(instant: Instant): Boolean = js.native
  def nextTransition(instant: Instant): ZoneOffsetTransition = js.native
  def previousTransition(instant: Instant): ZoneOffsetTransition = js.native
  def transitions(): js.Array[ZoneOffsetTransition] = js.native
  def transitionRules(): js.Array[ZoneOffsetTransitionRule] = js.native

  override def toString(): String = js.native
  override def equals(obj: Any): Boolean = js.native
}