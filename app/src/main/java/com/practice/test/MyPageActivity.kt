package com.practice.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val name = intent.getStringExtra("userName")
//        스트링의 경우 없어도 null 이 자동 입력 이지만 일반 (숫자) 등은 -1 등 입력하지 않을 시가 필요


        val age = intent.getIntExtra("userAge", -1)

        userNameTxt.text = "${name} : ${age}세"


    }
}
