package portugal.octavio.colections

fun main(){
    val nomes = Array<String>(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Rafaela"
    nomes[2] = "Octavio"

    for (nome in nomes) {
        println(nome)
    }

    println("___________________________________")
  nomes.sort()
  nomes.forEach { println(it) }

val nomes2 = arrayOf("Katarina", "Rafaela", "Octavio")

    println("___________________________________")
    nomes2.sort()
    nomes2.forEach { println(it) }
}