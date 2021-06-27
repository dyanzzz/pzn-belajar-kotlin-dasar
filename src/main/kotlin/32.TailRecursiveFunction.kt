fun main() {
    // 32. tail recursive function

    // jika menggunakan recursive function terlalu dalam, kemungkinan terjadi akan stack overflow
    // karena akan memanggil sampai ujung functionnya dulu, baru selesai

    // masalah ini di java, tidak bisa ditangani
    // di kotlin bisa ditangani dengan tail recursive function

    // sebenarnya tailrec pada kotlin tsb hanya mengubah dari looping mendalam, menjadi looping yg sejajar/looping biasa

    // syarat menggunakan tail recursive function
    // menambahakn tailrec di function

    // hanya boleh menambahkan recursivenya aja, tanpa ada embel" operasi lain

    // tail recursive
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    // tail recursive factorial
    tailrec fun factorialUsingRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            //else -> value * factorialUsingRecursive(value - 1)    // tidak bisa menggunakan tailrec karena returnnya dikalkulasi dengan kondisi lain
            else -> factorialUsingRecursive(value - 1, total * value)
        }
    }

    //println(display(5))

    println(factorialUsingRecursive(10))
}
