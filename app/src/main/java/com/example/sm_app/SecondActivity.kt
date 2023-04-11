package com.example.sm_app


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")
        val student = intent.getStringExtra("nstudent")


        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Name: "+name+"\nStudent Number: "+student

    }
}