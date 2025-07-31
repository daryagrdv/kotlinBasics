package lesson3

fun main(){
    var moveNumber = 1
    var moveFrom = "E2"
    var moveTo = "E4"

    println("[$moveFrom-$moveTo;$moveNumber]")

    moveFrom = "D2"
    moveTo = "D3"

    println("[$moveFrom-$moveTo;${++moveNumber}]")

}
