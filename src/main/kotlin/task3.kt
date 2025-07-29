fun main(){

    val year = 1961
    val flightHour = "09"
    val flightMinute = "07"
    val arrivalHour = "10"
    val arrivalMinute = "55"

    var hour = flightHour
    var minute = flightMinute

    println("Первый полет человека в космос приходится на $year год")
    println("Старт (ч.) $hour")
    println("Старт (мин.) $minute")

    hour = arrivalHour
    minute = arrivalMinute

    print("Посадка в ")
    print(hour)
    print(":")
    print(minute)

}
