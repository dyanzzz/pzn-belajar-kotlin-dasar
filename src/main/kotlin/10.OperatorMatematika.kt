fun main() {
    // 10. Operasi matematika
    val result = 10.8 / 2.3
    println(result)

    // sienctific matematic
    val result2 = 10 + 10 / 2   // kotlin mengutamakan operator pembagian dan perkalian terlebih dulu dibandingkan +/-
    println(result2)

    // augmented asigntmen
    // +=, -=, *=, /= %=
    println()
    var total = 0

    val barang1 = 100
    total += barang1
    println(total)

    val barang2 = 200
    total += barang2
    println(total)

    val barang3 = 300
    total += barang3
    println(total)

    // unary operator
    // ++, --, - (negative), + (positive), ! (negasi)
    println()
    total++
    println(total)
}