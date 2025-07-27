const val MINUTE_AS_SECONDS = 60
const val HOUR_AS_MINUTES = 60
const val DURATION_IN_SECONDS = 6480

fun main() {

    val minutes: Int = DURATION_IN_SECONDS / MINUTE_AS_SECONDS
    val secondsRest: Int = DURATION_IN_SECONDS % MINUTE_AS_SECONDS

    val hours: Int = minutes / HOUR_AS_MINUTES
    val minutesRest: Int = minutes % HOUR_AS_MINUTES

    println(String.format("%02d:%02d:%02d", hours, minutesRest, secondsRest))
}
