package control_flow

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class WhenKtTest {
  @Test
  fun cases() {
    val res = cases("Hello")
    assertEquals("Greeting", res)
  }
  
  @Test
  fun whenAssign() {
    val res = whenAssign(MyClass())
    assertEquals(42, res)
  }
}