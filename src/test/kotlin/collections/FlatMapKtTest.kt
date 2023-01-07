package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FlatMapKtTest {
  @Test
  fun myBag() {
    val list = listOf("apple", "orange", "banana", "grapes", "shirts", "pants", "jeans")
    val res = flatMapBag
    assertEquals(list, res)
  }
}