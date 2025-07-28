package lesson2

/*

Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.

 */

const val HOUR_AS_MINUTES = 60u

fun main() {

    val departureHour: UShort = 9u
    val departureMinute: UShort = 39u
    val travelTimeAsMinutes: UInt = 457u

    val arrivalTimeAsMinutes = departureHour * HOUR_AS_MINUTES + departureMinute + travelTimeAsMinutes

    var arrivalHour = arrivalTimeAsMinutes / HOUR_AS_MINUTES
    val arrivalMinutes = arrivalTimeAsMinutes - arrivalHour * HOUR_AS_MINUTES

    if (arrivalHour >= 24u) {
        arrivalHour %= 24u
    }

    println("Поезд прибудет в $arrivalHour ч. $arrivalMinutes мин.")

}
