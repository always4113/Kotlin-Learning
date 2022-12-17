package introduction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FunctionsKtTest {
  @Test
  fun printMessage() {
    val res = printMessage("Hello")
    assertEquals("Hello", res)
  }
  
  @Test
  fun printMessageWithPrefix() {
    val res = printMessageWithPrefix(prefix = "Log", message = "Hello")
    assertEquals("[Log] Hello", res)
  }
  
  @Test
  fun sum() {
    val res = sum(1, 2)
    assertEquals(3, res)
  }
  
  @Test
  fun multiply() {
    val res = multiply(2, 4)
    assertEquals(8, res)
  }
  
  @Test
  fun times() {
    val res = 2 times "Bye "
    assertEquals("Bye Bye ", res)
  }
  
  @Test
  fun to() {
    val res = pair.first
    assertEquals("Ferrari", res)
  }
  
  @Test
  fun onto() {
    val res = ("McLaren" onto "Lucas").first
    assertEquals("McLaren", res)
  }
  
  @Test
  fun person() {
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    val res = sophia.likedPeople[0]
    assertEquals(claudia, res)
  }
  
  @Test
  fun operator1() {
    val res = (2 * "Bye ")
    assertEquals("Bye Bye ", res)
  }
  
  @Test
  fun operator2() {
    val str = "Always forgive your enemies; nothing annoys them so much."
    val res = str[0..14]
    assertEquals("Always forgive ", res)
  }
  
  @Test
  fun printAll() {
    val str = """
      Hello
      Hallo
      Salut
      Hola
      你好
      
    """.trimIndent()
    val res = printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    assertEquals(str, res)
  }
  
  @Test
  fun printAllWithPrefix() {
    val str = """
      Greeting: Hello
      Greeting: Hallo
      Greeting: Salut
      Greeting: Hola
      Greeting: 你好
    
    """.trimIndent()
    val res = printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting:")
    assertEquals(str, res)
  }
  
  @Test
  fun log() {
    val str = """
      Hello
      Hola
      
    """.trimIndent()
    val res = log("Hello", "Hola")
    assertEquals(str, res)
  }
}