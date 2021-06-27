import com.company.belajar.util.sayHello
// import com.company.belajar.util.*    // untuk keyword import package menggunakan .* agar semua func dapat di import

fun main() {
    // 39. package and import
    // package == folder
    // penamaan package menggunakan huruf kecil semua
    // jika ingin membuat sub package, bisa menggunakan .(titik)

    // import hanya dapat mengakses file" didalam package yg sama
    // menggunakn kata kunci import untuk mengimport function didalam
        // package yg di import

    sayHello("budi bos")
    // bisa juga menuliskan semua nama packagenya, tanpa import di atas
    com.company.belajar.util.sayGoodBye("bang")
}