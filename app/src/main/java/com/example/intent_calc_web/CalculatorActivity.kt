package com.example.intent_calc_web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Edt_Answer: TextView
    lateinit var Edt_Firstno: EditText
    lateinit var Edt_secondno: EditText
    lateinit var Buttonadd: Button
    lateinit var Buttonsub: Button
    lateinit var Buttonmultiply: Button
    lateinit var Buttondivide: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Edt_Answer = findViewById(R.id.Edt_Answer)
        Edt_Firstno = findViewById(R.id.Edt_Firstno)
        Edt_secondno = findViewById(R.id.Edt_Secondno)
        Buttonadd = findViewById(R.id.Btn_Add)
        Buttonsub = findViewById(R.id.Btn_Subtract)
        Buttondivide = findViewById(R.id.Btn_Divide)
        Buttonmultiply = findViewById(R.id.Btn_Product)

        Buttonadd.setOnClickListener {
            val firstnum = Edt_Firstno.text.toString()
            val secondnum = Edt_secondno.text.toString()
            if (firstnum.isEmpty() and secondnum.isEmpty()) {
                Edt_Answer.text = "Please fill in all details"
            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                Edt_Answer.text = answer.toString()
            }
        }
        Buttonsub.setOnClickListener {
            val firstnum = Edt_Firstno.text.toString()
            val secondnum = Edt_secondno.text.toString()
            if (firstnum.isEmpty() and secondnum.isEmpty()) {
                Edt_Answer.text = "Please fill in all details"
            } else {
                var answer = firstnum.toDouble() - secondnum.toDouble()
                Edt_Answer.text = answer.toString()
            }
        }
        Buttonmultiply.setOnClickListener {
            val firstnum = Edt_Firstno.text.toString()
            val secondnum = Edt_secondno.text.toString()
            if (firstnum.isEmpty() and secondnum.isEmpty()) {
                Edt_Answer.text = "Please fill in all details"
            } else {
                var answer = firstnum.toDouble() * secondnum.toDouble()
                Edt_Answer.text = answer.toString()
            }

        }
        Buttondivide.setOnClickListener {
            val firstnum = Edt_Firstno.text.toString()
            val secondnum = Edt_secondno.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()) {
                Edt_Answer.text = "Please fill in all details"
            } else {
                var answer = firstnum.toDouble() / secondnum.toDouble()
                Edt_Answer.text = answer.toString()
            }
        }

    }
}