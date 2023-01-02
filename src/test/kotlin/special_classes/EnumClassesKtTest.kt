package special_classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class EnumClassesKtTest {
  @Test
  fun operation() {
    val res = when (State.RUNNING) {
      State.IDLE -> "It's idle"
      State.RUNNING -> "It's running"
      State.FINISHED -> "It's finished"
    }
    assertEquals("It's running", res)
  }

  @Test
  fun redColor() {
    val res = Color.RED
    assertEquals(Color.RED, res)
  }

  @Test
  fun blueColor() {
    val blue = Color.BLUE
    val res = blue.containsRed()
    assertEquals(false, res)
  }
}