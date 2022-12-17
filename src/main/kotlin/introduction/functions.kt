package introduction

fun printMessage(message: String): String {
  return message
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"): String {
  return "[$prefix] $message"
}

fun sum(x: Int, y: Int): Int {
  return x + y
}

fun multiply(x: Int, y: Int) = x * y

infix operator fun Int.times(str: String) = str.repeat(this)

val pair = "Ferrari" to "Katrina"

infix fun String.onto(other: String) = Pair(this, other)

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }
}

operator fun String.get(range: IntRange) = substring(range)

fun printAll(vararg messages: String): String {
  val buffer = StringBuffer()
  for (mes in messages) buffer.append("$mes\n")
  return buffer.toString()
}

fun printAllWithPrefix(vararg messages: String, prefix: String): String {
  val buffer = StringBuffer()
  for (mes in messages) buffer.append("$prefix $mes\n")
  return buffer.toString()
}

fun log(vararg entries: String): String {
  val buffer = StringBuffer()
  val res = printAll(*entries)
  buffer.append(res)
  return buffer.toString()
}