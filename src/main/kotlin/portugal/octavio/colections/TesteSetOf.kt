package portugal.octavio.colections

fun main() {
    val rafaela = Funcionario("Rafaela", 3000.0, "CLT")
    val octavio = Funcionario("Octavio", 5000.0, "PJ")
    val joao = Funcionario("João", 1700.0, "CLT")

    val funcionarios1 = setOf(rafaela, octavio)
    val funcionarios2 = setOf(joao)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach{println(it)}


    println("_____________________________________")

    val funcionarios3 = setOf(rafaela,octavio,joao)
    val resultSubtract = funcionarios3.subtract(funcionarios1)
    resultSubtract.forEach{println(it)}

    println("_____________________________________")
    val resultIntersection = funcionarios3.intersect(funcionarios2)
    resultIntersection.forEach{println(it)}

}