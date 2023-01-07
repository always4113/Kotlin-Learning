package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FirstLastKtTest {
  @Test
  fun getFirstElement() {
    val res = firstElement
    assertEquals(1, res)
  }

  @Test
  fun getFirstEvenElement() {
    val res = firstEven
    assertEquals(-2, res)
  }

  @Test
  fun startsWithF() {
    val res = firstF
    assertEquals("foo", res)
  }

  @Test
  fun endsWithF() {
    val res = lastF
    assertEquals(null, res)
  }
}