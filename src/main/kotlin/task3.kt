const val YEAR = 1961
const val FLIGHT_HOUR = "09"
const val FLIGHT_MINUTE = "07"
const val ARRIVAL_HOUR = "10"
const val ARRIVAL_MINUTE = "55"

fun main(){
    var hour = FLIGHT_HOUR
    var minute = FLIGHT_MINUTE

    println("Первый полет человека в космос приходится на $YEAR год")
    println("Старт (ч.) $hour")
    println("Старт (мин.) $minute")

    hour = ARRIVAL_HOUR
    minute = ARRIVAL_MINUTE

    print("Посадка в ")
    print(hour)
    print(":")
    print(minute)
}
