package com.example.lesson6_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<EditText>(R.id.editTextLogin)
        val pass = findViewById<EditText>(R.id.editTextPassword)
        val phone = findViewById<EditText>(R.id.editTextPhone)

        findViewById<Button>(R.id.enter).setOnClickListener {
            val user = User(
                login.text.toString(),
                pass.text.toString(), phone.text.toString()
            )
            val intent = Intent(
                this@MainActivity,
                MainActivity2::class.java
            )
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }
}
