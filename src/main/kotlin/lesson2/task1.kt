package lesson2

const val MARK_1 = 3f
const val MARK_2 = 4f
const val MARK_3 = 3f
const val MARK_4 = 5f

const val COUNT = 4

fun main() {

    var result: Float = MARK_1 + MARK_2 + MARK_3 + MARK_4
    result /= COUNT

    println(String.format("%.2f", result))

}
