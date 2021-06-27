fun main() {
    // 31. recursive function
    // function yg memanggil dirinya sendiri
    // menghitung factorial lebih mudah menggunakan recursive daripada menggunakan perulangan

    fun factorialUsingLoop(value: Int): Int {
        var  result = 1
        for (i in value downTo 1) {
            println(i)
            result *= i
            // 5 * 4 * 3 * 2 * 1
        }
        return result
    }

    fun factorialUsingRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialUsingRecursive(value - 1)
        }
    }

    println(factorialUsingRecursive(5))
    // 5 * 4 * 3 * 2 * 1
    println(factorialUsingLoop(5))
}



