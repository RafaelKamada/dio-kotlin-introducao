package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.Funcionario

class imprimeRelatorioFuncionario {

    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}