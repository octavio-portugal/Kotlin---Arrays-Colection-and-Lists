package portugal.octavio.colections

fun main() {
    val rafaela = Funcionario("Rafaela", 3000.0, "CLT")
    val octavio = Funcionario("Octavio", 5000.0, "PJ")
    val joao = Funcionario("João", 1700.0, "CLT")


    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(octavio.nome, octavio)
    repositorio.create(rafaela.nome, rafaela)


    println(repositorio.findById(octavio.nome))

    println("___________________________________")
    println(repositorio.findAll())

    println("___________________________________")
    repositorio.findAll().forEach{println(it)}

    println("___________________________________")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach{println(it)}
}