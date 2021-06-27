fun main() {
    // 16. while loops
    // perulangan bebas, akan terus berulang sampai data/ value bernilai false
    // harus berhati-hati menggunakna while, karena akan terus berulang/infinite loop

    // cek kondisi dulu, baru menjalankan blok kodenya
    // tidak akan menjalankan blok kodenya jika kondisi sudah salah sejak awal

    var i = 1
    while (i <= 10) {
        println("while loop : $i")
        i++
    }

    println("selesai perulangan")
}
