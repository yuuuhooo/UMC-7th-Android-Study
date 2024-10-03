package com.example.first_week_mission

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image1 = findViewById<ImageView>(R.id.stamp1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 스탬프 선택", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OnclickActivity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.stamp2)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 스탬프 선택", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OnclickActivity2::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.stamp3)
        image3.setOnClickListener {
            Toast.makeText(this, "3번 스탬프 선택", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OnclickActivity3::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.stamp4)
        image4.setOnClickListener {
            Toast.makeText(this, "4번 스탬프 선택", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OnclickActivity4::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.stamp5)
        image5.setOnClickListener {
            Toast.makeText(this, "5번 스탬프 선택", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OnclickActivity5::class.java)
            startActivity(intent)
        }


    }
}