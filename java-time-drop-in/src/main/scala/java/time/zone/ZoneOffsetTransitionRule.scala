package java.time.zone

import java.Wraps

import com.zoepepper.facades.jsjoda.zone.{ZoneOffsetTransitionRule => ZoneOffsetTransitionRuleF}

class ZoneOffsetTransitionRule protected[time](f: ZoneOffsetTransitionRuleF) extends Wraps(f)