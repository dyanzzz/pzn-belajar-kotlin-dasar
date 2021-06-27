fun main() {
    // 6. String

    var firstName: String = "budi"
    var lastName: String = "anto"

    var lengkap: String = """
        budianto
        dian tri
    """.trimIndent()

    var lengkapUsingTrimMarginPipe: String = """
        |budianto
        |dian tri
    """.trimMargin()

    var lengkapUsingTrimMargin: String = """
        >budianto
        >dian tri
    """.trimMargin(">")

    println(firstName)
    println(lengkap)
    println(lengkapUsingTrimMarginPipe)

    var fullName: String = "$firstName $lastName"
    println("total $fullName char = ${fullName.length}")
}