fun main() {
    // 24. function return type
    // mengembalikan nilai berdasarkan variable yg ditentukan oleh function tsb
    // fun sum(): Int {
    // : Int disini adalah type data yg di return

    // val hasil = sum(20, 30)
    println(sum(20, 30))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
