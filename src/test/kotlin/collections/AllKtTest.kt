package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class AllKtTest {
  @Test
  fun allEvenNumber() {
    val res = allEven
    assertEquals(false, res)
  }

  @Test
  fun allLess6Number() {
    val res = allLess6
    assertEquals(true, res)
  }
}