package java.time

trait Unwrapper {
  implicit def unwrapF[T <: AnyRef](wrapper: Wraps[T]): T = wrapper.f
}
