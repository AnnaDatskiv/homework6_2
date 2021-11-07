package com.example.lesson6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val login2 = findViewById<TextView>(R.id.editTextLogin2)
        val phone2 = findViewById<TextView>(R.id.editTextPhone2)

        val user1 = intent.getParcelableExtra<User>("user")

        login2.text = user1?.login.toString()
        phone2.text = user1?.phone.toString()
    }
}








