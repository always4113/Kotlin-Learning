package control_flow

fun cases(obj: Any): String {
  return when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a String"
    else -> "Unknown"
  }
}

fun whenAssign(obj: Any): Any {
  val result = when (obj) {
    1 -> "one"
    "Hello" -> 1
    is Long -> false
    else -> 42
  }
  return result
}

class MyClass