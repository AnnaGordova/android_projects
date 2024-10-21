package com.example.myapplication2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var btnAdd : Button
    private lateinit var lstFIO : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        lstFIO=findViewById(R.id.lst)


        findViewById<Button>(R.id.btnAdd).setOnClickListener{
            val intent = FIOActivity.newIntent(this@MainActivity)

            lstFIO.setText(intent.getStringExtra("txt"))
            startActivity(intent)

        }
        findViewById<Button>(R.id.buttonUpd).setOnClickListener{
            val intent = FIOActivity.newIntent(this@MainActivity)
            lstFIO.setText(intent.getStringExtra("txt"))




        }


    }
}