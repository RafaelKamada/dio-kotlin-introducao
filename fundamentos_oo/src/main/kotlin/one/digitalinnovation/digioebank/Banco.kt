package one.digitalinnovation.digioebank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = " $nome - $numero"
}
