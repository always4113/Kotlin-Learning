package control_flow

import org.junit.jupiter.api.Test
import java.io.StringWriter
import kotlin.test.assertEquals

internal class RangesKtTest {
  @Test
  fun inclusiveIterator() {
    val writer = StringWriter()
    inclusive(writer)
      .toString()

    val str = "0 1 2 3"
    val res = writer.toString()
    assertEquals(str, res.trim())
  }

  @Test
  fun exclusiveIterator() {
    val writer = StringWriter()
    exclusive(writer)
      .toString()

    val str = "0 1 2"
    val res = writer.toString()
    assertEquals(str, res.trim())
  }

  @Test
  fun downIterator() {
    val writer = StringWriter()
    down(writer)
      .toString()

    val str = "3 2 1 0"
    val res = writer.toString()
    assertEquals(str, res.trim())
  }

  @Test
  fun rangeCondition() {
    val res = condition()
    assertEquals("x is in range from 1 to 5", res)
  }
}