package com.zoepepper.facades.jsjoda.chrono

import com.zoepepper.facades.jsjoda.format.ResolverStyle
import com.zoepepper.facades.jsjoda.{Enum, LocalDate}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.IsoChronology")
object IsoChronology extends js.Object {
  def isLeapYear(prolepticYear: Double): Boolean = js.native
}

@js.native
class IsoChronology extends Enum {
  def resolveDate(fieldValues: js.Dictionary[Long], resolverStyle: ResolverStyle): LocalDate = js.native
}
