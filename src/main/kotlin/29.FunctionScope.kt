fun main() {
    // 29. function scope
    // ruang lingkup dimana function tsb bisa diakses
    // ketika membuat sebuah function, maka secara otomatis function tsb bisa diakses dari file kotlin manapun
    // membuat function didalam function/ inner function

    fun contohHelloWorld() {
        println("Hello world")
        dua()
    }

    contohHelloWorld()
}

fun satu() {
    println("Hallo bro")
}

fun dua() {
    satu()
}

