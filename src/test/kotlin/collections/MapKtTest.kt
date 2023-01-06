package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MapKtTest {
  @Test
  fun accountId1() {
    updatePointsCredit(1)
    val res = EZPassAccounts.getValue(1)
    assertEquals(115, res)
  }
}