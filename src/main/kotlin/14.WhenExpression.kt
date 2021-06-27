fun main() {
    // 14. When expression

    val finalExam = 'D'
    val passValue: Array<Char> = arrayOf('A', 'B', 'C')

    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good Job")
        else -> println("Please try again next examination")
    }

    when (finalExam) {
        'A' -> {
            println("Good guys")
        }
        'B' -> {
            println("Mantap")
        }
        else -> {
            println("sorry guys, please try again next week")
        }
    }

    // multiple option
    when (finalExam) {
        'A', 'B', 'C' -> println("Pass Final Exam")
        else -> println("Try again in exam next week")
    }

    // when expression in (using in to searching value on array)
    when (finalExam) {
        in passValue -> println("Pass final exam")
        !in passValue -> println("Try again in exam calculate using in")
    }

    // is (to determine/menentukan type data on value)
    when (finalExam) {
        is Char -> println("score is char")
        !is Char -> println("score is not char")
    }

    // when custom value
    when {
        finalExam == 'A' -> {
            println("Amazing")
        }
        finalExam == 'B' -> println("Good Job man")
        else -> println("Please try again bro, your score is $finalExam")
    }
}