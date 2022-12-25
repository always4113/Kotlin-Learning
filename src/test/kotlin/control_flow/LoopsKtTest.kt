package control_flow

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import java.io.StringWriter

internal class LoopsKtTest {
  @Test
  fun cakes() {
    val writer = StringWriter()
    getCakes(writer).toString()
    val str = """
      Yummy, it's a carrot cake!
      Yummy, it's a cheese cake!
      Yummy, it's a chocolate cake!
      
    """.trimIndent()
    val res = writer.toString()
    assertEquals(str, res)
  }

  @Test
  fun bread() {
    bakery()
    assertEquals(cakesEaten, cakesBaked)
  }

  @Test
  fun zoo() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) {
      println("Watch out, it's a ${animal.name}")
    }
  }
}