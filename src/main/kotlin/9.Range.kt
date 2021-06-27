fun main() {
    // 9. Type data Range
    val range = 1..100
    println(range.count())        //melihat banyaknya data pada variable range
    println(range.contains(20))   //melihat apakah ada data 20 didalam range
    println(range.first)          //melihat nilai pertama
    println(range.last)           //melihat nilai terakhir
    println(range.step)           //melihat langkah/perbedaan setiap langkahnya
    println()

    val rangeDownTo = 100 downTo 1
    println(rangeDownTo.count())        //melihat banyaknya data pada variable range
    println(rangeDownTo.contains(20))   //melihat apakah ada data 20 didalam range
    println(rangeDownTo.first)          //melihat nilai pertama
    println(rangeDownTo.last)           //melihat nilai terakhir
    println(rangeDownTo.step)           //melihat langkah/perbedaan setiap langkahnya
    println()

    val rangeStep = 1..100 step 3
    println(rangeStep.count())        //melihat banyaknya data pada variable range
    println(rangeStep.contains(31))   //melihat apakah ada data 20 didalam range
    println(rangeStep.first)          //melihat nilai pertama
    println(rangeStep.last)           //melihat nilai terakhir
    println(rangeStep.step)           //melihat langkah/perbedaan setiap langkahnya
}