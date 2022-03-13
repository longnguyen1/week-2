package com.example.android_challenge_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide();

        val button = findViewById<Button>(R.id.button4)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val pass = findViewById<EditText>(R.id.editTextTextPassword)

        button.setOnClickListener{
            println("1234")
            println(email.text)
            if(email.text.toString() == "ronaldo@gmail.com"){
                if(pass.text.toString() == "123456") {
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                }else{
                    email.setText("")
                    pass.setText("")
                }
            }else {
                email.setText("")
                pass.setText("")
            }
        }
    }
}