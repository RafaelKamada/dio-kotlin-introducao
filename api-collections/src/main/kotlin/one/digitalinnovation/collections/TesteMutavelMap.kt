package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 5000.0, "CLT")
    val paulo = Funcionario("Paulo", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(paulo.nome, paulo)

    println(repositorio.findById(joao.nome))

    println("------------------")
    repositorio.findAll().forEach { println(it) }

    println("------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }
}