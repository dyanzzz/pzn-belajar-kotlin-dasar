fun main() {
    // 37. inline function
    // improvement dari kotlin yang sangat powerfull dapat membantu membuat jalannya
        // system menjadi lebih cepat, karena inline function
    // inline function membuat byte code menduplicate kode/function yg ditandai dengan inline
    // kenapa menjadi lebih cepat, karena tidak perlu membuat object
    // jika tidak tibambahkan inline, bycode akan selalu membuat object
    // kendalanya terdapat jika looping sampai ribuan kali, maka akan membuat object juga sampai ribuan kali
    // hanya saja, dampak negativenya, karena duplikat function tsb,
        // ukuran bycode javanya akan menjadi cukup besar, tapi performnya lebih cepat
        // dibandingkan dengan looping object sampai ribuan kali

    println(hello { "kurniawan" })
    println(hello { "budianto" })

    for (i in 0..10) {
        println(helloBro(
            { "budi" },
            { "Anto" }
        ))
    }
}

// inline function
inline fun hello(name: () -> String): String {
    return "hello ${name()}"
}

// noinline untuk parameter yg tidak ingin menjadi inline di dalam 1 function
inline fun helloBro(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "hello ${firstName()} ${lastName()}"
}