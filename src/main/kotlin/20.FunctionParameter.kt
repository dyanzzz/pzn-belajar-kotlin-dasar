fun main() {
    // 20. function parameter/argument
    // bisa menambahkan lebih dari 1 parameter

    helloWorld("budi", null)
    helloWorld("budi", "anto")
    helloWorld("budi", "ahmad")
}

fun helloWorld(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}