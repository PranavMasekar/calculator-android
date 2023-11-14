package com.example.simplecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.add
import kotlinx.android.synthetic.main.activity_main.divide
import kotlinx.android.synthetic.main.activity_main.inputOne
import kotlinx.android.synthetic.main.activity_main.inputTwo
import kotlinx.android.synthetic.main.activity_main.multiply
import kotlinx.android.synthetic.main.activity_main.result
import kotlinx.android.synthetic.main.activity_main.subs

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener{
            val firstInput = inputOne.text.toString().toInt()
            val secondInput = inputTwo.text.toString().toInt()

            result.text = (firstInput + secondInput).toString()
        }

        subs.setOnClickListener{
            val firstInput = inputOne.text.toString().toInt()
            val secondInput = inputTwo.text.toString().toInt()

            result.text = (firstInput - secondInput).toString()
        }

        multiply.setOnClickListener{
            val firstInput = inputOne.text.toString().toInt()
            val secondInput = inputTwo.text.toString().toInt()

            result.text = (firstInput * secondInput).toString()
        }

        divide.setOnClickListener{
            val firstInput = inputOne.text.toString().toInt()
            val secondInput = inputTwo.text.toString().toInt()

            result.text = (firstInput / secondInput).toString()
        }
    }
}