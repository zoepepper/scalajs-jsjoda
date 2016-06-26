package java.time

import java.time.format.TextStyle
import java.time.temporal.TemporalAccessor
import java.time.zone.ZoneRules
import java.util.Locale

import com.zoepepper.facades.jsjoda.{ZoneId => ZoneIdF}

object ZoneId {
  def from(temporal: TemporalAccessor): ZoneId = ???
  def getAvailableZoneIds(): java.util.Set[ZoneId] = ???
  def of(zoneId: String): ZoneId = ???
  def of(zoneId: String, aliasMap: java.util.Map[String, String]): ZoneId = ???
  def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = ???
  def systemDefault(): ZoneId = ???
}

abstract class ZoneId protected[time](protected[time] val f: ZoneIdF) {
  def getDisplayName(style: TextStyle, locale: Locale): String = ???
  def getId(): String
  def getRules(): ZoneRules = f.rules
  def normalized(): ZoneId = f.normalized

  override def toString(): String = f.toString()
  override def hashCode(): Int = f.hashCode()
  override def equals(obj: Any): Boolean = f.equals(obj)
}
