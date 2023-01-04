package special_classes

import org.junit.jupiter.api.Test

internal class ObjectKeywordKtTest {
  @Test
  fun dispatcher() {
    val d = LuckDispatcher()
    d.getNumber()
  }
}