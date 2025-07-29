package lesson3

/*
Задача 2 к Уроку 3

Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова, и поменяла фамилию. О ней есть запись в одном из государственных приложений.
Приложение отслеживает изменения персональных данных граждан.

Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
Все части ФИО и возраст изначально хранятся в отдельных переменных.
 */
fun main(){

    val lastName = "Андреева"
    val firstName = "Татьяна"
    val patronomic = "Сергеевна"
    val age = 20u

    val updatedLastName = "Сидорова"
    val updatedAge = 22u

    println("[$lastName $firstName $patronomic, $age]")
    println("[$updatedLastName $firstName $patronomic, $updatedAge]")

}
