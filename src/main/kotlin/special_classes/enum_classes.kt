package special_classes

enum class State {
  IDLE, RUNNING, FINISHED
}

enum class Color(private val rgb: Int) {
  RED(0xFF0000),
  GREEN(0x00FF00),
  BLUE(0x0000FF),
  YELLOW(0xFFFF00);

  fun containsRed() = (this.rgb and 0xFF0000 != 0)
}