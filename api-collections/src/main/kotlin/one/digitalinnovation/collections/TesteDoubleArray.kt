package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    for (salario in salarios) {
        println("salario: $salario")
    }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salarios[index] * 1.1
    }

    salarios.forEach { println(it.format(2) ) }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it.format(2)) }
}

fun Double.format(digits: Int) = "%.${digits}f".format(this)
