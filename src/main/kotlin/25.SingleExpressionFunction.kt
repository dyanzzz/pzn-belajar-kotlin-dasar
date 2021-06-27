fun main() {
    // 25. single expression function
    // deklarasi function hanya dengan 1 baris kode
    // hanya butuh tanda = setelah deklarasi nama function dan type pengembalian function

    println(double(20))
    hi("budi")
}

fun double(a: Int) = a * 2

fun hi(name: String) = println("Hi $name")