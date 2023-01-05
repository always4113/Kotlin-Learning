package special_classes

import java.util.Random

class LuckDispatcher {
  fun getNumber(): Int {
    val objRandom = Random()
    return objRandom.nextInt(90)
  }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): String {

  val dayRates = object {
    var standard = 30 * standardDays
    var festivity = 50 * festivityDays
    var special = 100 * specialDays
  }

  val total = dayRates.standard + dayRates.festivity + dayRates.special

  return "Total price: $$total"

}

object DoAuth {
  fun takeParams(username: String, password: String): String {
    return "input Auth parameters = $username:$password"
  }
}

class BigBen {
  companion object Bonger {
    fun getBongs(nTimes: Int): String {
      val buffer = StringBuffer()
      for (i in 1..nTimes) buffer.append("BONG ")
      return buffer.toString()
    }
  }
}