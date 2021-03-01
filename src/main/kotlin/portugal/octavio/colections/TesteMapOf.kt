package portugal.octavio.colections

fun main() {
    val pair: Pair<String, Double> = Pair("Rafaela", 3000.0)
    val mapi = mapOf(pair)

    mapi.forEach { (k, v) -> println("Chave: $k - Valor: $v") }


    val map2 = mapOf(
        "Octavio" to 2500.0,
        "João" to 1700.0
    )
    map2.forEach{(k, v) ->println("Chave: $k - Valor: $v")}
}