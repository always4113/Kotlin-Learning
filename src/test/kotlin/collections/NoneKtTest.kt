package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class NoneKtTest {
  @Test
  fun allOddNumber() {
    val res = allOdd
    assertEquals(false, res)
  }

  @Test
  fun allGT6Number() {
    val res = allGT6
    assertEquals(false, res)
  }
}