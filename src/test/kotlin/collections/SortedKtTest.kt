package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SortedKtTest {
  @Test
  fun sortNumbers() {
    val list = listOf(5, 4, 3, 2, 1, -10)
    val res = inverted
    assertEquals(list, res)
  }
}