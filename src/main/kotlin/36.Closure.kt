fun main() {
    // 36. closure
    // kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yg sama
        // ketika bikin function didalam function, function tsb dapat dgunakan
    // harap menggunakan fitur ini dengan bijak ketika menerapkannya

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("lambda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("anonymous function increment")
        counter++
    }

    fun functionIncrement() {
        println("function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}
