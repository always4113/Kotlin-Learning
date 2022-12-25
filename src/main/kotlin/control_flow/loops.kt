package control_flow

import java.io.Writer

val cakes = listOf("carrot", "cheese", "chocolate")

fun getCakes(writer: Writer) {
  for (cake in cakes) {
    writer.write("Yummy, it's a $cake cake!\n")
  }
}

var cakesEaten = 0
var cakesBaked = 0

fun bakery() {
  while (cakesEaten < 5) {
    cakesEaten++
  }
  do {
    cakesBaked++
  } while (cakesBaked < cakesEaten)
}

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
  operator fun iterator(): Iterator<Animal> {
    return animals.iterator()
  }
}