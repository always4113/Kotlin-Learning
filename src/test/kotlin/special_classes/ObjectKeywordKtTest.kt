package special_classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ObjectKeywordKtTest {
  @Test
  fun dispatcher() {
    val number = LuckDispatcher()
    number.getNumber()
  }

  @Test
  fun rent() {
    val res = rentPrice(10, 2, 1)
    assertEquals("Total price: $500", res)
  }

  @Test
  fun authentication() {
    val res = DoAuth.takeParams("always4113", "134340")
    assertEquals("input Auth parameters = always4113:134340", res)
  }

  @Test
  fun bong() {
    val str = "BONG BONG BONG"
    val res = BigBen.getBongs(3)
    assertEquals(str, res.trim())
  }
}