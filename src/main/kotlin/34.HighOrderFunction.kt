fun main() {
    // 34. High Order Function
    // function yg menggunakan function sebagai parameter, bahkan dapat mengembalikan function lain
    // kadang berguna untuk function yg general dan ingin mendapatkan input yg flexible berupa lambda,
        // yg dapat di declare oleh user ketika memanggil function tsb

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // val lambdaUpper:(String) -> String = { value: String -> value.uppercase()}
    val lambdaUpper = { value: String -> value.uppercase() }
    println(hello("budi", lambdaUpper))

    println(hello("BudIanto", { value: String -> value.lowercase() }))

    // trailing lambda
    // biasanya bikin lambda di dalam parameter hello, dibatasi dengan ,(coma)
    // tapi karena fitur trailing lambda ini, lambdanya bisa diluar parameter hello
    println(hello("BudIanto Bos") { value: String -> value.lowercase() })
}