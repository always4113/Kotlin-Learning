package introduction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class NullSafetyKtTest {
  @Test
  fun getLength() {
    nullable = null
    val res = strLength(nullable.toString())
    assertEquals(4, res)
  }
  
  @Test
  fun describeString() {
    val res = describeString("Kotlin")
    assertEquals("String of length 6", res)
  }
}