package com.zoepepper.facades.jsjoda.format

import com.zoepepper.facades.jsjoda.Enum

import scalajs.js
import scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSJoda.ResolverStyle")
object ResolverStyle extends js.Object {
  val STRICT: ResolverStyle = js.native
  val SMART: ResolverStyle = js.native
  val LENIENT: ResolverStyle = js.native
}

@js.native
@JSGlobal("JSJoda.ResolverStyle")
class ResolverStyle extends Enum
