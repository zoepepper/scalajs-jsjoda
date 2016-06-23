package com.zoepepper.facades.jsjoda

import java.time
import java.time.Clock
import java.time.temporal._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.Instant")
object Instant extends js.Object {
  def now(clock: Clock = ???): Instant = js.native
  def ofEpochSecond(epochSecond: Double, nanoAdjustment: Int = ???): Instant = js.native
  def ofEpochMilli(epochMilli: Double): Instant = js.native
  def from(temporal: temporal.Temporal): Instant = js.native
  def parse(text: String): Instant = js.native

  val EPOCH: Instant = js.native
  val MAX: Instant = js.native
  val MIN: Instant = js.native
}

@js.native
class Instant private(seconds: Double, nanoOfSecond: Int) extends temporal.Temporal {
  @JSName("epochSecond") def getEpochSecond(): Double = js.native
  @JSName("nano") def getNano(): Int = js.native
  def isSupported(field: TemporalField): Boolean = js.native
  def isSupported(unit: TemporalUnit): Boolean = js.native
  def getLong(unit: TemporalUnit): Long = js.native
  def `with`(adjuster: TemporalAdjuster, newValue: Double): Instant = js.native
  def `with`(field: TemporalField, newValue: Double): Instant = js.native
  def withTemporalAdjuster(adjuster: TemporalAdjuster): Instant = js.native
  def truncatedTo(unit: TemporalUnit): Instant = js.native
  def plus(amount: temporal.TemporalAmount): Instant = js.native
  def plus(amount: Double, unit: TemporalUnit): Instant = js.native
  def plusSeconds(secondsToAdd: Double): Instant = js.native
  def plusMillis(millisToAdd: Double): Instant = js.native
  def plusNanos(nanosToAdd: Double): Instant = js.native
  def minus(amount: temporal.TemporalAmount): Instant = js.native
  def minus(amount: Double, unit: TemporalUnit): Instant = js.native
  def minusSeconds(secondsToSubtract: Double): Instant = js.native
  def minusMillis(millisToSubtract: Double): Instant = js.native
  def minusNanos(nanosToSubtract: Double): Instant = js.native
  def adjustInto(temporal: temporal.Temporal): temporal.Temporal = js.native
  def until(endExclusive: temporal.Temporal, unit: TemporalUnit): Double = js.native
  def toEpochMilli(): Double = js.native
  def compareTo(otherInstant: Instant): Int = js.native
  def isAfter(otherInstant: Instant): Boolean = js.native
  def isBefore(otherInstant: Instant): Boolean = js.native
}
