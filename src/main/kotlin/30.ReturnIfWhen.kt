fun main() {
    // 30. return if and when

    fun returnIfWhen(name: String): String {

        // using if
        /*return if(name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }*/

        // using when
        return when(name) {
            "" -> "Hello bro"
            else -> "Hello $name"
        }
    }

    println(returnIfWhen("budi"))
    println(returnIfWhen(""))
}


