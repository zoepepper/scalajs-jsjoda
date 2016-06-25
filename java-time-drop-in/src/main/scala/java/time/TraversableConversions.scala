package java.time

import scala.reflect.ClassTag
import scalajs.js

import scala.language.implicitConversions

trait TraversableConversions {
  implicit def jsArrayF2scalaArray[B: ClassTag, A](a: js.Array[A])(implicit ev: A => B): Array[B] = {
    a.map(ev).toArray.asInstanceOf[Array[B]] // Compiler is not inferring Array[B] but Array[Object]
  }

  implicit def jsArrayF2javaList[B: ClassTag, A](a: js.Array[A])
                                                (implicit ev: js.Array[A] => Array[B]): java.util.List[B] =
    java.util.Arrays.asList(ev(a):_*)
}
