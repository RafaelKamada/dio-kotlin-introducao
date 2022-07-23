package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Cliente
import one.digitalinnovation.digioebank.ClienteTipo

fun main() {
    val jose = Cliente (
     nome = "Jose da Silva",
     cpf = "1234",
     clienteTipo = ClienteTipo.PF,
     senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}