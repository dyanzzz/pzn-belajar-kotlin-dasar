fun main() {
    // 26. function varargs parameter
    // posisinya harus pada paling kanan/ diakhir
    // data yg diterima berupa array

    val values = arrayOf(10, 10, 10, 10)
    println(hitungTotal(values))
    println(hitungTotalUsingVaraargs("budi", 10, 20, 30, 40, 50))
}

fun hitungTotal(values: Array<Int>): Int {
    var total = 0
    for (value in values) {
        total += value
    }
    return total
}

fun hitungTotalUsingVaraargs(name: String, vararg values: Int): String {
    var total = 0
    for (value in values) {
        total += value
    }
    return "Nilai $name adalah $total"
}