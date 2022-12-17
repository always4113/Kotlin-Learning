package introduction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class GenericsKtTest {
  private val stack = MutableStack(0.62, 3.14, 2.7)
  
  @Test
  fun push() {
    stack.push(9.87)
    assertEquals(stack.elements[3], 9.87)
  }
  
  @Test
  fun peek() {
    stack.peek()
    assertEquals(stack.elements[2], 2.7)
  }
  
  @Test
  fun pop() {
    val res = stack.pop()
    assertEquals(2.7, res)
    }
  
  @Test
  fun mutableStackOf() {
    val res = mutableStackOf(0.62, 3.14, 2.7)
    assertEquals(stack.elements, res.elements)
  }
}