package com.example.toastcontext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToast: Button = findViewById(R.id.btnToast)

        btnToast.setOnClickListener {
          Toast.makeText(this, "This is my first Android GitHub Repository", Toast.LENGTH_LONG).show()
        }


    }
}