package com.example.myformlogin_sarjuni

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myformlogin_sarjuni.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var loginButton :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "user" && binding.password.text.toString()  =="sarjuni"){
                Toast.makeText(this, "Login berhasil bolo !", Toast.LENGTH_SHORT).show()} else {

                Toast.makeText(this, "Salah, Kamu belum ngopi !", Toast.LENGTH_SHORT).show()
            }
        })

    }
}