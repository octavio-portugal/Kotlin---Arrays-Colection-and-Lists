package portugal.octavio.colections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 5
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }
    println("_______________________________")
    values.forEach {
        println(it)
    }

    println("_______________________________")
    values.forEach { valor ->
        println(valor)
    }
    println("_______________________________")
    for (index in values.indices)
        println(values[index])


    println("_______________________________")
    values.sort()
    for (valor in values)
        println(valor)
}