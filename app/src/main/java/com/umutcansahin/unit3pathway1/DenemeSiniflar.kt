package com.umutcansahin.unit3pathway1

import com.umutcansahin.unit3pathway1.Quiz.StudentProgress.printProgressBar
import com.umutcansahin.unit3pathway1.Quiz.StudentProgress.progressText

fun main(){

    //println(Quiz.progressText)
    Quiz.printProgressBar()
/*
    val quiz = Quiz()
    quiz.printQuiz()

 */
    Quiz().apply {
        printQuiz()

    }
}

enum class Difficulty {
    EASY,MEDIUM,HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3

        val Quiz.StudentProgress.progressText: String
            get() = "${answered} of ${total} answered"

        fun Quiz.StudentProgress.printProgressBar() {
            repeat(Quiz.answered) {
                print("▓") }
            repeat(Quiz.total - Quiz.answered) {
                print("▒") }
            println()
            println(Quiz.progressText)
        }
    }
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

}