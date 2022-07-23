package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 5000.0, "CLT")
    val paulo = Funcionario("Paulo", 4000.0, "PJ")

    val funcionario1 = setOf(joao, paulo)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("------------------")
    val funcionario3 = setOf(joao, paulo, maria)
    val resultSubstract = funcionario3.subtract(funcionario2)
    resultSubstract.forEach { println(it) }

    println("------------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }
}