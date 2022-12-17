package introduction

var neverNull: String = "This can't be null"
var nullable: String? = "You can keep a null here"
var inferredNonNull = "The compiler assumes non-null"

fun strLength(notNull: String): Int {
  return notNull.length
}

fun describeString(maybeString: String?): String {
  return if (!maybeString.isNullOrEmpty()) {
    "String of length ${maybeString.length}"
  } else {
    "Empty or null string"
  }
}