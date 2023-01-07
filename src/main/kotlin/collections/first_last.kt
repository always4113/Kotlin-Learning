package collections

private val numbers = listOf(1, -2, 3, -4, 5, -6)

val firstElement = numbers.first()
val lastElement = numbers.last()

val firstEven = numbers.first { it % 2 == 0 }
val lastOdd = numbers.last { it % 2 != 0 }

private val words = listOf("foo", "bar", "baz", "faz")

val firstF = words.firstOrNull { it.startsWith('f') }
val lastF = words.lastOrNull { it.endsWith('f') }