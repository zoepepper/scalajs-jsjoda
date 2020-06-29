package java.time.zone

import java.Wraps
import java.time.{Duration, Instant, LocalDateTime, ZoneOffset}
import scala.collection.JavaConverters._

import com.zoepepper.facades.jsjoda.zone.{ZoneRules => ZoneRulesF}

object ZoneRules {
  def of(offset: ZoneOffset): ZoneRules = ZoneRulesF.of(offset)
  def of(baseStandardOffset: ZoneOffset, baseWallOffset: ZoneOffset,
         standardOffsetTransitionList: java.util.List[ZoneOffsetTransition],
         transitionList: java.util.List[ZoneOffsetTransition],
         lastRules: java.util.List[ZoneOffsetTransitionRule]) = ???
}

class ZoneRules protected[time](f: ZoneRulesF) extends Wraps(f) {
  def getDaylightSavings(instant: Instant): Duration = f.daylightSavings(instant)
  def getOffset(instant: Instant): ZoneOffset = f.offset(instant)
  def getOffset(localDateTime: LocalDateTime): ZoneOffset = f.offset(localDateTime)
  def getStandardOffset(instant: Instant): ZoneOffset = f.standardOffset(instant)
  def getTransition(localDateTime: LocalDateTime): ZoneOffsetTransition = f.transition(localDateTime)
  def getTransitionRules(): java.util.List[ZoneOffsetTransitionRule] = f.transitionRules().toList.map(tr => tr: ZoneOffsetTransitionRule).asJava
  def getTransitions(): java.util.List[ZoneOffsetTransition] = f.transitions().toList.map(t => t: ZoneOffsetTransition).asJava
  def getValidOffsets(localDateTime: LocalDateTime): java.util.List[ZoneOffset] = f.validOffsets(localDateTime).toList.map(zo => zo: ZoneOffset).asJava
  def isDaylightSavings(instant: Instant): Boolean = f.isDaylightSavings(instant)
  def isFixedOffset(): Boolean = f.isFixedOffset()
  def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): Boolean = f.isValidOffset(localDateTime, offset)
  def nextTransition(instant: Instant): ZoneOffsetTransition = f.nextTransition(instant)
  def previousTransition(instant: Instant): ZoneOffsetTransition = f.previousTransition(instant)

  override def toString(): String = f.toString()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
