package com.example.changecolor

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.changecolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        binding.refreshColor.setOnClickListener {
            binding.main.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
    }

    override fun onResume() {
        super.onResume()
        if (MyColor.color != "") {
            binding.main.setBackgroundColor(Color.parseColor(MyColor.color))
        } else {
            binding.main.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
    }
}