package lesson2

fun main() {

    val mark1 = 3f
    val mark2 = 4f
    val mark3 = 3f
    val mark4 = 5f

    var result: Float = mark1 + mark2 + mark3 + mark4
    result /= 4

    println(String.format("%.2f", result))

}
