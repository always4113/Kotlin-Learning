package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FilterKtTest {
  @Test
  fun positiveNumbers() {
    val list = listOf(1, 3, 5)
    val res = positives
    assertEquals(list, res)
  }

  @Test
  fun negativeNumbers() {
    val list = listOf(-2, -4, -6)
    val res = negatives
    assertEquals(list, res)
  }
}