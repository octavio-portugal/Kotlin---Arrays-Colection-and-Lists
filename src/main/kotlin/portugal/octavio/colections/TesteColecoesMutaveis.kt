package portugal.octavio.colections

fun main() {
    val rafaela = Funcionario("Rafaela", 3000.0, "CLT")
    val octavio = Funcionario("Octavio", 5000.0, "PJ")
    val joao = Funcionario("João", 1700.0, "CLT")

    println("_____________List_____________")
    val funcionarios = mutableListOf(rafaela, joao)
    funcionarios.forEach{println(it)}


    println("__________________________")
    funcionarios.add(octavio)
    funcionarios.forEach{println(it)}


    println("__________________________")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}



    println("_____________SetOf_____________")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{println(it)}

    println("__________________________")
    funcionarioSet.add(octavio)
    funcionarioSet.add(rafaela)
    funcionarioSet.forEach{println(it)}


    println("__________________________")
    funcionarioSet.remove(joao)
    funcionarioSet.forEach{println(it)}

}

