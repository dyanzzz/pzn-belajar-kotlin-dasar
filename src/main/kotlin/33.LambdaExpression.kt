fun main() {
    // 33. Lambda Expression
    // first class citizen atau function yang bisa berdiri sendiri tanpa class
    // function bisa menjadi lambda expression atau
        // function bisa dibuat tanpa memiliki nama

    // lambda expression
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    println(contohLambda("Budi", "doremi"))

    // kata kunci it
        // it bisa jalan, jika hanya 1 parameter
        // it dianggap sebagai resresentasi dari parameter pertama yg di defined
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("budi"))

    // method references
        // membuat lambda dari references yg sudah ada
        // menggunakan :: sebagai symbol method reference
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Budianto"))
}

// method yg di reference ke main
fun toUpper(value: String): String = value.uppercase()