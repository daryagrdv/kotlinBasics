fun main() {
    val seconds: UShort = 6480u

    val minutes: UInt = seconds / 60u
    val secondsRest: UInt = seconds % 60u

    val hours: UInt = minutes / 60u
    val minutesRest: UInt = minutes % 60u

    println( "$hours:$minutesRest:$secondsRest")
}
