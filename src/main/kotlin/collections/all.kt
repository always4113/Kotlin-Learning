package collections

private val numbers = listOf(1, -2, 3, -4, 5, -6)

val allEven = numbers.all { it % 2 == 0 }

val allLess6 = numbers.all { it < 6 }