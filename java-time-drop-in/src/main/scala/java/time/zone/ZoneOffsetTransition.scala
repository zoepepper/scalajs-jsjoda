package java.time.zone

import java.Wraps
import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}

import com.zoepepper.facades.jsjoda.zone.{ZoneOffsetTransition => ZoneOffsetTransitionF}

object ZoneOffsetTransition {
  def of(transition: LocalDateTime, offsetBefore: ZoneOffset, offsetAfter: ZoneOffset): ZoneOffsetTransition =
    ZoneOffsetTransitionF.of(transition, offsetBefore, offsetAfter)
}

class ZoneOffsetTransition protected[time](f: ZoneOffsetTransitionF) extends Wraps(f) {
  def getInstant(): Instant = f.instant
  def toEpochSecond(): Long = f.toEpochSecond.toLong
  def getDateTimeBefore(): LocalDateTime = f.dateTimeBefore
  def getDateTimeAfter(): LocalDateTime = f.dateTimeAfter
  def getOffsetBefore(): LocalDateTime = f.offsetBefore
  def getOffsetAfter(): LocalDateTime = f.offsetAfter
  def getDuration(): Duration = f.duration
  def isGap(): Boolean = f.isGap
  def isOverlap(): Boolean = f.isOverlap
  def isValidOffset(offset: ZoneOffset): Boolean = f.isValidOffset(offset)
  def compareTo(other: ZoneOffsetTransition): Int = f.compareTo(other)

  override def toString(): String = f.toString
  override def hashCode(): Int = f.hashCode
  override def equals(obj: Any): Boolean = obj match {
    case other: ZoneOffsetTransition => f.equals(other.f)
    case _ => false
  }
}
