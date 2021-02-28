package portugal.octavio.colections

fun main() {
    val values = intArrayOf(2, 5, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println ("___________________________________________")
    values.sort()
    values.forEach {
        println(it)
    }
}
