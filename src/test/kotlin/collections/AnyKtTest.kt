package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class AnyKtTest {
  @Test
  fun anyNegativeNumber() {
    val res = anyNegative
    assertEquals(true, res)
  }

  @Test
  fun anyGT6Number() {
    val res = anyGT6
    assertEquals(false, res)
  }
}