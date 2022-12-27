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