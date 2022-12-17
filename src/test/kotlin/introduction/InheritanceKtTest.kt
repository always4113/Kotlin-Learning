package introduction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class InheritanceKtTest {
  @Test
  fun dog() {
    val dog: Dog = Yorkshire()
    val res = dog.sayHello()
    assertEquals("wif wif!", res)
  }
  
  @Test
  fun tiger() {
    val tiger: Tiger = SiberianTiger()
    val res = tiger.sayHello()
    assertEquals("A tiger from Siberia says: grrhhh!", res)
  }
  
  @Test
  fun lion() {
    val lion: Lion = Asiatic("Rufo")
    val res = lion.sayHello()
    assertEquals("Rufo, the lion from India says: graoh!", res)
  }
}