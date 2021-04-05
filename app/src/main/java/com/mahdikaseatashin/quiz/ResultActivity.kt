package com.mahdikaseatashin.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tv_result_username.text = intent.getStringExtra(MainActivity.USERNAME).toString()
        tv_result_grade.text = "${intent.getIntExtra(QuestionsActivity.TRUE_ANS,0)} / ${intent.getIntExtra(QuestionsActivity.TOTAL_ANS,0)}"

    }

    fun onClickFinish(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
