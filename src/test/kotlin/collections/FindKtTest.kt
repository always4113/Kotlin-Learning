package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FindKtTest {
  @Test
  fun findFirst() {
    val res = first
    assertEquals("something", res)
  }

  @Test
  fun findLast() {
    val res = last
    assertEquals("somehow", res)
  }

  @Test
  fun findNothing() {
    val res = nothing
    assertEquals(null, res)
  }
}