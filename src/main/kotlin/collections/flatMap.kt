package collections

val fruitsBag = listOf("apple","orange","banana","grapes")
val clothesBag = listOf("shirts","pants","jeans")
val cart = listOf(fruitsBag, clothesBag)
val flatMapBag = cart.flatMap { it }