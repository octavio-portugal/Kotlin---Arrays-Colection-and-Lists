package portugal.octavio.colections

fun main() {
    val salarios = arrayOf(
        "2000.0".toBigDecimal(),
        "1700.0".toBigDecimal(),
        "4000.0".toBigDecimal()
    )
    println("_______________________________")
    println(salarios.somatoria())

    println("_______________________________")
    println(salarios.media())
}