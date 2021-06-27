fun main() {
    // 27. Extention Function
    // menambahkan function pada tipe data yang sudah ada

    val name = "Budi"
    println(name.hello())

    println("anto".hello())

    name.printHello()

    "budianto".printHello()
}

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("hello bro $this")
