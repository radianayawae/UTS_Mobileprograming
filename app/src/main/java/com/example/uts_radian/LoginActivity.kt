package com.example.uts_didhan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val rgs = findViewById<TextView>(R.id.daftarview)
        rgs.setOnClickListener({
            Intent(this, DaftarActivity::class.java).also {
                startActivity(it)
            }
        })

        val buttonLogin = findViewById<Button>(R.id.loginbutton)
        buttonLogin.setOnClickListener({
            Toast.makeText(this,"LoGIN", Toast.LENGTH_SHORT).show();
            Log.d("Login","klik");
            Intent(this, ProfileActivity::class.java).also {
                startActivity(it)
            }
        })
    }
}