package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ZipKtTest {
  @Test
  fun resultPairs() {
    val list = listOf("a" to 1, "b" to 2, "c" to 3)
    val res = A zip B
    assertEquals(list, res)
  }

  @Test
  fun resultReduce() {
    val list = listOf("a1", "b2", "c3")
    val res = A.zip(B) { a, b -> "$a$b" }
    assertEquals(list, res)
  }
}