fun main() {
    // 18. Break and Continue
    // digunakan untuk semua perulangan pada kotlin
    // break -> digunakan untuk menghentikan seluruh perulangan
    // continue -> digunakan untuk menghentikan perulangan yg sedang berjalan, dan melanjutkan ke perulangan berikutnya

    var i = 0

    // break
    while (true) {
        println("break me : $i")
        i++

        if (i > 10) {
            break
        }
    }

    // continue
    for (i in 1..100) {
        if (i % 2 == 0) {   // dimodulo 2/ angka habis dibagi 2
            continue
        }
        println("angka : $i")
    }
}