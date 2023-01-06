package functional

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LambdaFunctionsKtTest {
  @Test
  fun lambda() {
    val res = upperCase4("hello")
    assertEquals("HELLO", res)
  }
}