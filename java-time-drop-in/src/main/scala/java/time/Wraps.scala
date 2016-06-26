package java.time

abstract class Wraps[T <: AnyRef] protected[time](protected[time] val f: T) extends Wrapper