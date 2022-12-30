package control_flow

fun main() {
  val authors = setOf("Shakespeare", "Hemingway", "Twain")
  val writers = setOf("Twain", "Shakespeare", "Hemingway")

  val structural = (authors == writers)
  val referential = (authors === writers)

  println(structural)
  println(referential)
}