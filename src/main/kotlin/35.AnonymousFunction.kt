fun main() {
    // 35. anonymous function
    // digunakan untuk kasus kasus kompleks, berbeda dengan lambda yg hanya dapat digunakan untuk kasus-kasus sederhana
        // misal. tanpa banyak kondisi

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        return if (value == "") {
            "UPS"
        } else {
            value.uppercase()
        }
    }

    println(hello("Budi", upper))
    println(hello("", upper))

    // anonymous function as parameter
    println(hello("Ahmad", fun(value: String): String {
        return value.uppercase()
    }))
}