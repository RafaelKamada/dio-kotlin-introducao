package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "José"

    for (nome in nomes) {
        println("nome -> $nome")
    }

    println("-------------")
    val nomesArrayOf = arrayOf("Maria", "Zaza", "Jose", "João")

    nomesArrayOf.forEach { println(it) }

}
