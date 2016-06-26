package java.time.format

import java.time.Wraps

import com.zoepepper.facades.jsjoda.format.{ResolverStyle => ResolverStyleF}

object ResolverStyle {
  val STRICT: ResolverStyle = ResolverStyleF.STRICT
  val SMART: ResolverStyle = ResolverStyleF.SMART
  val LENIENT: ResolverStyle = ResolverStyleF.LENIENT
}

class ResolverStyle protected[time](f: ResolverStyleF) extends Wraps(f)
