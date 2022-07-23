package one.digitalinnovation.digioebank.testes

import one.digitalinnovation.digioebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.toString()}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}