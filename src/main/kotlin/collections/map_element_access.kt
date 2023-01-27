package collections

val map = mapOf("key" to 42)

val mapWithDefault = map.withDefault { k -> k.length }