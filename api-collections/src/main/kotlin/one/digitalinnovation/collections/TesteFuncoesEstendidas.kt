package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000.0".toBigDecimal(),
        "3000.0".toBigDecimal(),
        "4000.0".toBigDecimal(),
        "1000.0".toBigDecimal()
    )

    salarios.forEach { println(it) }

    println("---------------")
    println(salarios.somatoria())
    println("---------------")
    println(salarios.media())
}