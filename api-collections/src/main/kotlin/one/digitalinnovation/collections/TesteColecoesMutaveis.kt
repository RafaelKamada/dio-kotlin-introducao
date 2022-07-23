package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 5000.0, "CLT")
    val paulo = Funcionario("Paulo", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("------------------")
    funcionarios.add(paulo)
    funcionarios.forEach{ println(it) }

    println("------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-------SET-----------")
    val funcionariosSet = mutableSetOf(joao)
    //funcionariosSet.forEach{ println(it) }

    println("------------------")
    funcionariosSet.add(maria)
    funcionariosSet.add(paulo)
    funcionariosSet.forEach{ println(it) }

    println("------------------")
    funcionariosSet.remove(paulo)
    funcionariosSet.forEach{ println(it) }
}