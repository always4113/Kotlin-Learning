package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MinMaxOrNullKtTest {
  @Test
  fun emptyList() {
    val res = empty.minOrNull()
    assertEquals(null, res)
  }

  @Test
  fun oneNumberList() {
    val res = only.maxOrNull()
    assertEquals(3, res) // the same as minOrNull().
  }
}