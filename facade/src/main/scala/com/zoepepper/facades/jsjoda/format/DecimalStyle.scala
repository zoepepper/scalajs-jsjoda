package com.zoepepper.facades.jsjoda.format

import scalajs.js

@js.native
class DecimalStyle extends js.Object {
  def positiveSign: Char = js.native
  def withPositiveSign(positiveSign: Char): DecimalStyle = js.native
  def negativeSign: Char = js.native
  def withNegativeSign(negativeSign: Char): DecimalStyle = js.native
  def zeroDigit: Char = js.native
  def withZeroDigit(zeroDigit: Char): DecimalStyle = js.native
  def decimalSeparator: Char = js.native
  def withDecimalSeparator(decimalSeparator: Char): DecimalStyle = js.native
}
