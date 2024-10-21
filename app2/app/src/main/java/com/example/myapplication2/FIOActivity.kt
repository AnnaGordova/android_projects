package com.example.myapplication2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

var txt = ""
class FIOActivity : AppCompatActivity() {

    private lateinit var btnSubmit : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fioactivity)

        btnSubmit = findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            val FirstNameText = findViewById<EditText>(R.id.FirstName).getText().toString()
            val LastNameText = findViewById<EditText>(R.id.LastName).getText().toString()
            val PatronymicText = findViewById<EditText>(R.id.Patronymic).getText().toString()
            txt +=  LastNameText + " " + FirstNameText + " " + PatronymicText +"\n"
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }

    companion object {
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, FIOActivity::class.java).apply {
                putExtra("txt", txt)
            }
        }
    }


}