package java.time

import com.zoepepper.facades.jsjoda.{ZoneOffset => ZoneOffsetF}

object ZoneOffset {

}

class ZoneOffset protected[time](f: ZoneOffsetF) extends ZoneId(f) {

}
