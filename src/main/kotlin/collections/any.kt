package collections

private val numbers = listOf(1, -2, 3, -4, 5, -6)

val anyNegative = numbers.any { it < 0 }

val anyGT6 = numbers.any { it > 6 }