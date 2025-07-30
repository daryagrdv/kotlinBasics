package lesson2

fun main(){

    val oldEmployeesCount: Int = 50
    val oldEmployeeSalary: Int = 30000

    val traineesCount: Int = 30
    val traineesSalary: Int = 20000

    val oldEmployeesExpenses: Int = oldEmployeeSalary * oldEmployeesCount
    val traineesExpenses: Int = traineesSalary * traineesCount

    val commonExpenses: Int = oldEmployeesExpenses + traineesExpenses

    val avrgEmployees: Int = (oldEmployeesExpenses + traineesExpenses) / (oldEmployeesCount + traineesCount)

    println("Затраты на старых сотрудников $oldEmployeesExpenses")
    println("Общие затраты на всех $commonExpenses")
    println("Средняя зп после прихода стажеров $avrgEmployees")

}
