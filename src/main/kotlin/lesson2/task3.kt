package lesson2

/*

Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.

 */

const val HOUR_AS_MINUTES = 60
const val DAY_AS_HOURS = 24


fun main() {

    val departureHour: Short = 9
    val departureMinute: Short = 39
    val travelTimeAsMinutes: Int = 457

    val arrivalTimeAsMinutes = departureHour * HOUR_AS_MINUTES + departureMinute + travelTimeAsMinutes

    var arrivalHour = arrivalTimeAsMinutes / HOUR_AS_MINUTES
    val arrivalMinutes = arrivalTimeAsMinutes % arrivalHour
    arrivalHour %= DAY_AS_HOURS

    println("Поезд прибудет в $arrivalHour ч. $arrivalMinutes мин.")

}
