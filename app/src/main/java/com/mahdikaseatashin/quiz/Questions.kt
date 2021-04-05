package com.mahdikaseatashin.quiz

data class Questions(
    val id: Int,
    val question: String,
    val logo: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
