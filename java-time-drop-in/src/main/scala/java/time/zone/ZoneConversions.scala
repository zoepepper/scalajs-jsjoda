package java.time.zone

import java.time.{ZoneId, ZoneOffset}

import com.zoepepper.facades.jsjoda.zone.{ZoneOffsetTransition => ZoneOffsetTransitionF, ZoneOffsetTransitionRule => ZoneOffsetTransitionRuleF, ZoneRules => ZoneRulesF}
import com.zoepepper.facades.jsjoda.{ZoneId => ZoneIdF}
import com.zoepepper.facades.jsjoda.{ZoneOffset => ZoneOffsetF}

import scala.language.implicitConversions

trait ZoneConversions {
  implicit def f2ZoneRules(f: ZoneRulesF): ZoneRules = new ZoneRules(f)
  implicit def f2ZoneId(f: ZoneIdF): ZoneId = new ZoneOffset(f.asInstanceOf[ZoneOffsetF])
  implicit def f2ZoneOffsetTransition(f: ZoneOffsetTransitionF): ZoneOffsetTransition = new ZoneOffsetTransition(f)
  implicit def f2ZoneOffsetTransitionRule(f: ZoneOffsetTransitionRuleF): ZoneOffsetTransitionRule = new ZoneOffsetTransitionRule(f)
}
