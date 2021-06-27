fun main() {
    // 28. Function Infix Notation
    // operasi yg biasa dilakukan pada opeasi matematika
    // menggunakan infix notation tidak wajib menggunakan tanda . (titik)

    val result = "Budianto" to "LOW"
    println(result)
}

infix fun String.to(type: String): String {
    return if(type == "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}
