package com.practice.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok.setOnClickListener {

            val inputName = nameEdt.text.toString()
            val inputBirthYear = birthYearEdt.text.toString()

            val myIntent = Intent(this, MyPageActivity::class.java)
            myIntent.putExtra("userName", inputName)
            myIntent.putExtra("userAge", 2020-inputBirthYear+1)
            startActivity(myIntent)


        }

    }
}
