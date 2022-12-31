package special_classes

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DataClassesKtTest {
  private val user = User("Alex", 1)
  private val secondUser = User("Alex", 1)
  private val thirdUser = User("Max", 2)

  @Test
  fun equality() {
    val res1 = (user == secondUser)
    val res2 = (user == thirdUser)

    assertEquals(true, res1)
    assertEquals(false, res2)
  }

  @Test
  fun hash_code() {
    val res = user.hashCode()
    assertEquals(63347075, res)
  }

  @Test
  fun copy_instance() {
    val copiedUser1 = user.copy()
    val res1 = (user === copiedUser1)
    assertEquals(false, res1)

    val copiedUser2 = user.copy(name = "Max")
    val res2 = copiedUser2.toString()
    assertEquals("User(name=Max, id=1)", res2)
  }

  @Test
  fun component() {
    val res = user.component1()
    assertEquals("Alex", res)
  }
}