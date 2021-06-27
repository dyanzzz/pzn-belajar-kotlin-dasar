fun main() {
    // 7. variable

    // 1. mutable = bisa diubah -> var
    // 2. immutable = tidak bisa diubah -> val

    var firstName: String = "budi"
    firstName = "budianto"
    println(firstName)

    val lastName = "budi"
    //lastName = "budianto"
    println(lastName)

    val address: String = ""
    println(address.length)

    // menggunakan variable constance yg di defined di luar function main
    println(APPLICATION)
}

// constance
// constance adalah variable yg dapat digunakan secara global
const val APPLICATION = "ini adalah constance belajar kotlin"