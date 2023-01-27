package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MapElementAccessKtTest {
  @Test
  fun getNumber1() {
    val res = map["key"]
    assertEquals(42, res)
  }

  @Test
  fun getNumber2() {
    val res = map["key2"]
    assertEquals(null, res)
  }

  @Test
  fun getNumber3() {
    val res = map.getValue("key")
    assertEquals(42, res)
  }

  @Test
  fun getNumber4() {
    val res = mapWithDefault.getValue("key2")
    assertEquals(4, res)
  }
}