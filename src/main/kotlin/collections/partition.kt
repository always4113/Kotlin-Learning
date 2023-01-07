package collections

private val numbers = listOf(1, -2, 3, -4, 5, -6)

val evenOdd = numbers.partition { it % 2 == 0 }
val positiveNegative = numbers.partition { it > 0 }