package com.mahdikaseatashin.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        const val USERNAME = "Username"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start_quiz.setOnClickListener {
            if (edt_username.text.toString().isNotEmpty()) {
                val intent = Intent(this, QuestionsActivity::class.java).apply {
                    putExtra(Companion.USERNAME, edt_username.text.toString())
                }
                startActivity(intent)
                finish()
            }
        }
    }
}
