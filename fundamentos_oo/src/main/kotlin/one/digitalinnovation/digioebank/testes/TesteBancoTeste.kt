package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    println(digiOneBank.info())
}
