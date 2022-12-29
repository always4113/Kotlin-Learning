package control_flow

import java.io.Writer

fun inclusive(writer: Writer) {
  for (i in 0..3) {
    writer.write("$i ")
  }
}

fun exclusive(writer: Writer) {
  for (i in 0 until 3) {
    writer.write("$i ")
  }
}

fun down(writer: Writer) {
  for (i in 3 downTo 0) {
    writer.write("$i ")
  }
}

const val x = 2
fun condition(): String {
  var str = ""
  if (x in (1..5)) {
    str = "x is in range from 1 to 5"
  }
  return str
}