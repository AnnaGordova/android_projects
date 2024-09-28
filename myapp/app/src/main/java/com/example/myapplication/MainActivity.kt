package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    @SuppressLint("SetTextI18n")
    fun Button_click (view: View){
        val num1= findViewById<EditText>(R.id.editTextText).getText().toString().toDouble();
//        var n1:Float?=null;
        val operation = findViewById<EditText>(R.id.editTextText2).getText().toString();
        val num2 = findViewById<EditText>(R.id.editTextText3).getText().toString().toDouble();
//        var n2:Float?=null;
        val tView=findViewById<TextView>(R.id.textView)
        var result=0.0;
        if (operation == "+") {
            result = num1 + num2
            tView.text = result.toString()
        }
        else if (operation == "-") {
            result = num1 - num2
            tView.text = result.toString()
        }
        else if (operation == "/") {
            if (num2 != 0.0) {
                result = num1 / num2
                tView.text = result.toString()
            }
            else
                tView.text = "Ошибка"
        }
        else if (operation == "*") {
            result = num1 * num2
            tView.text = result.toString()
        }
        else
            tView.text = "Ошибка"
    }
}