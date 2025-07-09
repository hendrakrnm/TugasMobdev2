package com.example.tugasmobdev2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasmobdev2.databinding.ActivityListBinding

class ListActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackList.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            startActivity(intent)
        }
    }




}