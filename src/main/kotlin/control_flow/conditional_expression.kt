package control_flow

fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
  val res = max(99, -42)
  println(res)
}