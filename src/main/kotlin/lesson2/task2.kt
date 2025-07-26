package lesson2

fun main(){

    val oldEmployeesCount: UInt = 50u
    val oldEmployeeSalary: UInt = 30000u

    val traineesCount: UInt = 30u
    val traineeSalary: UInt = 20000u

    val oldEmployeesExpenses: UInt = oldEmployeeSalary * oldEmployeesCount
    val traineesExpenses: UInt = traineeSalary * traineesCount

    val commonExpenses: UInt = oldEmployeesExpenses + traineesExpenses

    val avrgEmployees: UInt = (oldEmployeesExpenses + traineesExpenses) / (oldEmployeesCount + traineesCount)

    println("Затраты на старых сотрудников $oldEmployeesExpenses")
    println("Общие затраты на всех $commonExpenses")
    println("Средняя зп после прихода стажеров $avrgEmployees")

}
