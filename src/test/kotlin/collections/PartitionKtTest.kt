package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class PartitionKtTest {
  @Test
  fun positives() {
    val list = listOf(1, 3, 5)
    val res = positiveNegative.first
    assertEquals(list, res)
  }

  @Test
  fun evenNumbers() {
    val list = listOf(-2, -4, -6)
    val res = evenOdd.first
    assertEquals(list, res)
  }
}