package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLogin: Button = findViewById(R.id.btnLogin)
        var etPass: EditText = findViewById(R.id.etPass)
        var etUserName: EditText = findViewById(R.id.etUserName)

        
        etPass.setOnFocusChangeListener { view, b ->
            btnLogin.isEnabled = etUserName.text.isNotEmpty() && etPass.text.isNotEmpty()
        }
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Hello Dear ${etUserName.text}", Toast.LENGTH_SHORT).show()
        }
    }
}