package functional

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ExtensionsKtTest {
  private val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

  @Test
  fun itemValue() {
    val res = order.maxPricedItemValue()
    assertEquals(29.0F, res)
  }

  @Test
  fun nameValue() {
    val res = order.maxPricedItemName()
    assertEquals("Wine", res)
  }

  @Test
  fun itemNames() {
    val res = order.commaDelimitedItemNames
    assertEquals("Bread, Wine, Water", res)
  }

  @Test
  fun nullCheck() {
    val res = null.nullSafeToString()
    assertEquals("NULL", res)
  }
}