package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 5000.0, "CLT")
    val paulo = Funcionario("Paulo", 4000.0, "PJ")

    val funcionarios = listOf(joao, maria, paulo)

    funcionarios.forEach { println(it) }

    println("--------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("--------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()

}