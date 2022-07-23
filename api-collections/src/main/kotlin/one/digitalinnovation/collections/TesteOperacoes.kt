package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2022.0, 3000.0, 4000.0)

    for (salario in salarios) {
        println("salario: $salario")
    }

    println("------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")


    println("------------")
    val salariosMarioQue2500 = salarios.filter { it > 2500}
    salariosMarioQue2500.forEach( { println("salarios maior que 2500 = $it") })

    println("------------")
    println("count - ${salarios.count { it in 2050.0..5000.0 }}")

    println("------------")
    println("find - ${salarios.find { it == 4000.0 }}")
    println("find - ${salarios.find { it == 4001.0 }}")


    println("------------")
    println("any - ${salarios.any { it == 1000.0 }}")
}