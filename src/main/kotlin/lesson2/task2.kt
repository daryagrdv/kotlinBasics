package lesson2

const val OLD_EMPLOYEES_COUNT: UInt = 50u
const val OLD_EMPLOYEES_SALARY: UInt = 30000u

const val TRAINEES_COUNT: UInt = 30u
const val TRAINEES_SALARY: UInt = 20000u

fun main(){

    val oldEmployeesExpenses: UInt = OLD_EMPLOYEES_SALARY * OLD_EMPLOYEES_COUNT
    val traineesExpenses: UInt = TRAINEES_SALARY * TRAINEES_COUNT

    val commonExpenses: UInt = oldEmployeesExpenses + traineesExpenses

    val avrgEmployees: UInt = (oldEmployeesExpenses + traineesExpenses) / (OLD_EMPLOYEES_COUNT + TRAINEES_COUNT)

    println("Затраты на старых сотрудников $oldEmployeesExpenses")
    println("Общие затраты на всех $commonExpenses")
    println("Средняя зп после прихода стажеров $avrgEmployees")

}
