fun main() {
    // 8. Array
    // tipe data array hanya dapat menampung data yg tipe datanya sama
    // jika string, maka semua datanya harus string
    // jika integer, maka semua datanya harus integer

    val names: Array<String> = arrayOf("budi", "eko")
    val budi = names[0]
    names[0] = "budianto"
    println("data $budi diganti ${names[0]}")
    println(names[1])

    val members: Array<String?> = arrayOfNulls(5)   // set array boleh null
    members[0] = "budi"
    members[1] = "budi"
    members[2] = "budi"
    members[3] = null
    members[4] = "budi"
    println(members[3])
}