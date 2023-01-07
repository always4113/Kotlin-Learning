package collections

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class AssociateByGroupByKtTest {
  @Test
  fun phoneNumber() {
    val res = phoneBook.getValue("+1-888-123456").name
    assertEquals("John", res)
  }

  @Test
  fun cityName() {
    val res = cityBook.getValue("+1-888-123456")
    assertEquals("Boston", res)
  }

  @Test
  fun cities() {
    val list = listOf("Svyatoslav", "Vasilisa")
    val res = peopleCities.getValue("Saint-Petersburg")
    assertEquals(list, res)
  }

  @Test
  fun lastPersonCity() {
    val res = lastPersonCity.getValue("Saint-Petersburg")
    assertEquals("Vasilisa", res)
  }
}