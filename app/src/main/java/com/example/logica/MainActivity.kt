package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener{
            tester()
        }
    }


    private fun tester(){
        if (ans1.text.toString() == "T" && ans2.text.toString() == "F" && ans3.text.toString() == "F" && ans4.text.toString() == "F"){
            onCorrectAnswer()
        }else{
            onIncorrectAnswer()
        }
    }

    private fun onCorrectAnswer(){
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

    private fun onIncorrectAnswer(){
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}
