package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class GetOrElseKtTest {
  @Test
  fun getNumber1() {
    val res = list.getOrElse(1) { 42 }
    assertEquals(10, res)
  }

  @Test
  fun getNumber2() {
    val res = list.getOrElse(10) { 42 }
    assertEquals(42, res)
  }
}