package functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
  return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int {
  return ::square
}

fun square(x: Int) = x * x