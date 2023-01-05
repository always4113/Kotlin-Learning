package functional

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class HigherOrderFunctionsKtTest {
  @Test
  fun sum() {
    val res = calculate(4, 5, ::sum)
    assertEquals(9, res)
  }

  @Test
  fun mul() {
    val res = calculate(4, 5) {a, b -> a * b}
    assertEquals(20, res)
  }

  @Test
  fun square() {
    val function = operation()
    val res = function(2)
    assertEquals(4, res)
  }
}