package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SetKtTest {
  @Test
  fun issues() {
    val aNewIssue = "uniqueDescr4"
    val res = getStatusLog(addIssue(aNewIssue))
    assertEquals("registered correctly.", res)
  }
}