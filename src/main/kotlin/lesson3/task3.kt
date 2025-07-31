package lesson3

/*
Задача 3 к Уроку 3

Пишем программу, которая будет помогать учить таблицу умножения. В отдельную переменную будет записываться число (объявить и проинициализировать),
а выводиться будет таблица умножения для этого числа. Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
*/

fun main() {

    val number = 3
    var factor = 1

    println(
        """
        $number x $factor = ${number * factor++}
        $number x $factor = ${number * factor++} 
        $number x $factor = ${number * factor++} 
        $number x $factor = ${number * factor++} 
        $number x $factor = ${number * factor++}
        $number x $factor = ${number * factor++}
        $number x $factor = ${number * factor++}
        $number x $factor = ${number * factor++}
        $number x $factor = ${number * factor}
    """.trimIndent()
    )

}
