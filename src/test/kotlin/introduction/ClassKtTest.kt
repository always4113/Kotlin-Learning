package introduction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ClassKtTest {
  @Test
  fun createInstance() {
    val customer = Customer()
    val contact = Contact(1, "mary@gmail.com")
    
    contact.email = "jane@gmail.com"
    assertEquals("jane@gmail.com", contact.email)
  }
}