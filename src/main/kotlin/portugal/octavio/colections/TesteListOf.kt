package portugal.octavio.colections

fun main() {
    val rafaela = Funcionario("Rafaela", 3000.0, "CLT")
    val octavio = Funcionario("Octavio", 5000.0, "PJ")
    val joao = Funcionario("João", 1700.0, "CLT")

    val funcionarios = listOf(rafaela, octavio, joao)

    funcionarios.forEach { println(it) }

    println("_______________________")
    println(funcionarios.find { it.nome == "Rafaela" })


    println("_______________________")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("_______________________")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

