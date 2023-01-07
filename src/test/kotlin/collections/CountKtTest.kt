package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CountKtTest {
  @Test
  fun allNumbers() {
    val res = totalCount
    assertEquals(6, res)
  }

  @Test
  fun evenNumbers() {
    val res = evenCount
    assertEquals(3, res)
  }
}