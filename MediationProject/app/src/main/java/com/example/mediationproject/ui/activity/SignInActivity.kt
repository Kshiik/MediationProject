package com.example.mediationproject.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mediationproject.R
import com.google.android.material.textfield.TextInputEditText

class SignInActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: TextInputEditText

    override  fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.te_password)
    }

    fun signIn(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this@SignInActivity,  MenuActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "У вас есть незаполненные поля", Toast.LENGTH_SHORT).show()
        }
    }
}