package special_classes

import java.util.Random

class LuckDispatcher {
  fun getNumber() {
    val objRandom = Random()
    println(objRandom.nextInt(90))
    objRandom.nextInt(90)
  }
}