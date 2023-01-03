package special_classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SealedClassesKtTest {
  @Test
  fun greeting() {
    val cat = Cat("Snowy")
    val res = greetMammal(cat)
    assertEquals("Hello Snowy", res)
  }
}