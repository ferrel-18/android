package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCalc:Button
    lateinit var ButtonIntent:Button
    lateinit var ButtonWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonWeb=findViewById(R.id.Btn_Web)
        ButtonWeb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
        ButtonIntent=findViewById(R.id.Btn_intent)
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        ButtonCalc=findViewById(R.id.Btn_calc)
        ButtonCalc.setOnClickListener {
            val calc=Intent(this,CalculatorActivity::class.java)
            startActivity(calc)

        }
    }
}