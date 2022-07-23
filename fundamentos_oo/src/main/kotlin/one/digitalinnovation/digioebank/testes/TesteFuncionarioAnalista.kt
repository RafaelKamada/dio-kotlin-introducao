package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Analista
import one.digitalinnovation.digioebank.Funcionario
import one.digitalinnovation.digioebank.Gerente

fun main() {
    var joaozinho = Analista(nome = "Maria do Carmo", cpf = "213.123.123-12", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(joaozinho)
}