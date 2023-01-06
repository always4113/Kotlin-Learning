package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ListKtTest {
  @Test
  fun users() {
    addSystemUser(4)
    val res = getSysSudoers().size
    assertEquals(4, res)
  }
}