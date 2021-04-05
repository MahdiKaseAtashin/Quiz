package com.mahdikaseatashin.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_questions_activity.*

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var userName: String = ""
    private var mQuestions = 0
    private var selectedOption = 0
    private var numCorrectAnswers = 0

    companion object {
        const val TRUE_ANS = "True Answers"
        const val TOTAL_ANS = "Total Answers"
    }

    private val list = Constants.getQuestions()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions_activity)

        userName = intent.getStringExtra(MainActivity.USERNAME).toString()

        setQuestion(mQuestions + 1, list[mQuestions])

        tv_option_two.setOnClickListener(this)
        tv_option_one.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(i: Int, questions: Questions) {
        tv_question.text = questions.question
        iv_logo.setImageResource(questions.logo)
        progress_bar_quiz.progress = i
        tv_progress.text = "$i/${progress_bar_quiz.max}"
        tv_option_one.text = questions.optionOne
        tv_option_two.text = questions.optionTwo
        tv_option_three.text = questions.optionThree
        tv_option_four.text = questions.optionFour
    }

    override fun onClick(v: View) {
        clearSelected()
        if (btn_submit.text != "Show Result" && btn_submit.text != "Next Question")
            when (v.id) {
                tv_option_one.id -> {
                    selectedOption = 1
                    tv_option_one.setBackgroundResource(R.drawable.selected_options_background)
                }
                tv_option_two.id -> {
                    selectedOption = 2
                    tv_option_two.setBackgroundResource(R.drawable.selected_options_background)
                }
                tv_option_three.id -> {
                    selectedOption = 3
                    tv_option_three.setBackgroundResource(R.drawable.selected_options_background)
                }
                tv_option_four.id -> {
                    selectedOption = 4
                    tv_option_four.setBackgroundResource(R.drawable.selected_options_background)
                }
                btn_submit.id -> {
                    clearSelected()
                    if (selectedOption == list[mQuestions].correctAnswer)
                        numCorrectAnswers++
                    setTrueFalseColor(selectedOption, list[mQuestions].correctAnswer)
                    if (mQuestions < list.size - 1) {
                        mQuestions++
                        btn_submit.text = "Next Question"
                    } else {
                        btn_submit.text = "Show Result"
                    }
                }
            }
        else if (btn_submit.text == "Next Question" && v.id == btn_submit.id) {
            btn_submit.text = "Submit"
            selectedOption = 0
            setQuestion(mQuestions + 1, list[mQuestions])
        } else if (btn_submit.text == "Show Result" && v.id == btn_submit.id) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(TRUE_ANS, numCorrectAnswers)
            intent.putExtra(TOTAL_ANS, list.size)
            intent.putExtra(MainActivity.USERNAME, userName)
            startActivity(intent)
            finish()
        }
    }

    private fun setTrueFalseColor(selected: Int, trueAns: Int) {
        if (selected != 0) {
            when (selected) {
                1 -> tv_option_one.setBackgroundResource(R.drawable.false_options_background)
                2 -> tv_option_two.setBackgroundResource(R.drawable.false_options_background)
                3 -> tv_option_three.setBackgroundResource(R.drawable.false_options_background)
                4 -> tv_option_four.setBackgroundResource(R.drawable.false_options_background)
            }
        }
        when (trueAns) {
            1 -> tv_option_one.setBackgroundResource(R.drawable.true_options_background)
            2 -> tv_option_two.setBackgroundResource(R.drawable.true_options_background)
            3 -> tv_option_three.setBackgroundResource(R.drawable.true_options_background)
            4 -> tv_option_four.setBackgroundResource(R.drawable.true_options_background)
        }
    }

    private fun clearSelected() {
        tv_option_one.setBackgroundResource(R.drawable.default_options_background)
        tv_option_two.setBackgroundResource(R.drawable.default_options_background)
        tv_option_three.setBackgroundResource(R.drawable.default_options_background)
        tv_option_four.setBackgroundResource(R.drawable.default_options_background)
    }
}
