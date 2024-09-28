package com.example.myapplication

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private val questionBank = listOf(
        Question( R.string.q1, true),
        Question(R.string.q2, true),
        Question(R.string.q3, true),
        Question(R.string.q4, true),
    )
    private var currentIndex = 0
    var isCheater = false

    val currentQuestionAnswer:Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText:Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        isCheater = false
        currentIndex=(currentIndex + 1)% questionBank.size
    }
    fun moveToPrev() {
        isCheater = false
        currentIndex=(currentIndex - 1)% questionBank.size
    }
}