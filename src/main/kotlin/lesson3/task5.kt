package lesson3

/*
Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку, отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности.
 */
fun main(){

    val inputString = "D2-D4;0"

    val moveFrom = inputString.subSequence(0, inputString.indexOf('-'))
    val moveTo = inputString.subSequence(inputString.indexOf('-') + 1, inputString.indexOf(';'))
    val moveNumber = inputString.last()

    println(moveFrom)
    println(moveTo)
    println(moveNumber)

}
