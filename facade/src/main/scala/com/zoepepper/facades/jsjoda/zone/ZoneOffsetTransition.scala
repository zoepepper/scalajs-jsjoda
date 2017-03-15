package com.zoepepper.facades.jsjoda.zone

import com.zoepepper.facades.jsjoda.{Duration, Instant, LocalDateTime, ZoneOffset}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.ZoneOffsetTransition")
object ZoneOffsetTransition extends js.Object {
  def of(transition: LocalDateTime, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransition = js.native
}

@js.native
class ZoneOffsetTransition(transition: LocalDateTime, before: ZoneOffset, after: ZoneOffset) extends js.Object {
  def instant(): Instant = js.native
  def toEpochSecond(): Double = js.native
  def dateTimeBefore(): LocalDateTime = js.native
  def dateTimeAfter(): LocalDateTime = js.native
  def offsetBefore(): LocalDateTime = js.native
  def offsetAfter(): LocalDateTime = js.native
  def duration(): Duration = js.native
  def isGap(): Boolean = js.native
  def isOverlap(): Boolean = js.native
  def isValidOffset(offset: ZoneOffset): Boolean = js.native
  def validOffsets(): js.Array[ZoneOffset] = js.native
  def compareTo(other: ZoneOffsetTransition): Int = js.native

  override def toString(): String = js.native
  override def hashCode(): Int = js.native
  override def equals(obj: Any): Boolean = js.native
}
