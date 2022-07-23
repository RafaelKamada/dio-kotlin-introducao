package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Funcionario
import one.digitalinnovation.digioebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria do Carmo", cpf = "213.123.123-12", salario = 5000.0, senha = "senha123")
    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}