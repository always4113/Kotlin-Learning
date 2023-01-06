package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MapExtensionKtTest {
  @Test
  fun doubleNumbers() {
    val list = listOf(2, -4, 6, -8, 10, -12)
    val res = doubled
    assertEquals(list, res)
  }

  @Test
  fun tripleNumbers() {
    val list = listOf(3, -6, 9, -12, 15, -18)
    val res = tripled
    assertEquals(list, res)
  }
}