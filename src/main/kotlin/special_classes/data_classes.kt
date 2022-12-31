package special_classes

data class User(val name: String, val id: Int) {
  override fun equals(other: Any?) =
    other is User && other.id == this.id

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + id
    return result
  }
}