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

  @Test
  fun getNumber3() {
    val res = getOrElseMap.getOrElse("x") { 1 }
    assertEquals(1, res)
  }

  @Test
  fun getNumber4() {
    getOrElseMap["x"] = 3
    val res = getOrElseMap.getOrElse("x") { 1 }
    assertEquals(3, res)
  }

  @Test
  fun getNumber5() {
    getOrElseMap["x"] = null
    val res = getOrElseMap.getOrElse("x") { 1 }
    assertEquals(1, res)
  }
}