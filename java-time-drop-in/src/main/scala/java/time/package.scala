package java

import java.time.temporal.TemporalConversions
import java.time.zone.ZoneConversions

package object time extends BaseConversions with TemporalConversions
  with ZoneConversions with TraversableConversions