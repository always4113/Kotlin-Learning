package collections

private val numbers = listOf(1, -2, 3, -4, 5, -6)

val allOdd = numbers.none { it % 2 == 0 }

val allGT6 = numbers.none { it < 6 }