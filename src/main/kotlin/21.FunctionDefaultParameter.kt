fun main() {
    // 21. function default argument/ parameter

    hello("budi")
    hello("budi", "anto")
}

fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("hello $firstName")
    } else {
        println("hello $firstName $lastName")
    }
}