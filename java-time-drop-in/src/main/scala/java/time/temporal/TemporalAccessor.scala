package java.time.temporal

import scala.scalajs
import scala.scalajs.js


trait TemporalAccessor extends scalajs.js.Object {
  def query[T](query: TemporalQuery[T]): T = scalajs.js.native
  def get(field: TemporalField): Double = scalajs.js.native
  def range(field: TemporalField): ValueRange = scalajs.js.native
}