fun main() {
    val seconds: Short = 6480

    val minutes: Int = seconds / 60
    val secondsRest: Int = seconds % 60

    val hours: Int = minutes / 60
    val minutesRest: Int = minutes % 60

    println(String.format("%02d:%02d:%02d", hours, minutesRest, secondsRest))
}
