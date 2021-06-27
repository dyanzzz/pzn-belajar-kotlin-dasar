fun main() {
    // 38. Label
    // label itu adalah penanda
    // diawali dengan @
    // gunanya ->
        // bisa diintegrasikan dengan break, continue & return
        //

    test("Eko") test@{
        if (it == "") {
            return@test
        } else {
            println("eko")
        }
    }
}

fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

fun labelBreak() {
    // integrasi dengan break
    loopI@ for (i in 0..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i x $j = ${i*j}")

        }
    }
}

fun labelContinue() {
    // integrasi dengan continue
    loopI@ for (i in 0..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i x $j = ${i*j}")

        }
    }
}

