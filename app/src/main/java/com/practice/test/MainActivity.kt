package com.practice.test

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//1000이라는 숫자가, 주소를 얻기위한 요청이라고 메모
    val REQ_FOR_ADDRESS = 1000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok.setOnClickListener {

            val myIntent = Intent(this, EditAddressActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_ADDRESS)

            val inputName = nameEdt.text.toString()
            val inputBirthYear = birthYearEdt.text.toString()

            val myIntent = Intent(this, MyPageActivity::class.java)
            myIntent.putExtra("userName", inputName)
            myIntent.putExtra("userAge", "2020-inputBirthYear+1)
            startActivity(myIntent)


        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        요청종류확인
        if (requestCode == REQ_FOR_ADDRESS)
//    확인을 눌러서 종료된게 맞는지
            if (resultCode == Activity.RESULT_OK)
//                맞으면 첨부된 데이터를 받자

                val main = data?.getStringExtra("mainAddress")
        val detail = data?.getStringExtra("detailAddress")

        addressTxt.text = "${main} / ${detail}"

    }

}
