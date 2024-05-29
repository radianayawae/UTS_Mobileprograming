package com.example.uts_didhan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)


        val login = findViewById<TextView>(R.id.login)
        login.setOnClickListener({
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
            }
        })

        val buttonDaftar = findViewById<Button>(R.id.daftarbutton)
        buttonDaftar.setOnClickListener({
            Toast.makeText(this,"terdaftar", Toast.LENGTH_SHORT).show();
            Log.d("Daftar","klik");
            Intent(this, ProfileActivity::class.java).also {
                startActivity(it)
            }
        })
    }
}