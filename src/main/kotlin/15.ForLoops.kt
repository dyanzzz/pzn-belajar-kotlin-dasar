fun main() {
    // 15. foor loops
    // perulangan terhadap data iterator. seperti array & range
    val names: Array<String> = arrayOf("Budi", "Anto", "Dian", "Tri")

    var total = 0
    for (name in names) {
        val no = total+1
        println("$no. $name")
        total++
    }
    println("Total perulangan $total")

    // using range in for
    for (i in 0..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray ) {
        println("Index $i : ${names[i]}")
    }

}
