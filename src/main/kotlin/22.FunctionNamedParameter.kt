fun main() {
    // 22. function named parameter/ argument
    // kelebihannya function named argument, bisa memanggil argument
        // meskipun urutannya tidak sesuai/ yg penting harus mention nama argumentnya dengan benar

    fullName(
        lastName = "budianto",
        firstname = "dian",
        middleName = "tri"
    )
}

fun fullName(
    firstname: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstname $middleName $lastName")
}