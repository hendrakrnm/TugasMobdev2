package com.example.tugasmobdev2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugasmobdev2.databinding.ActivityLoginBinding
import com.example.tugasmobdev2.databinding.ActivityTodoBinding
import com.example.tugasmobdev2.databinding.ActivityListBinding

class TodoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTodoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.list1.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
        binding.list2.setOnClickListener{
            val intent = Intent(this, ListActivity2::class.java)
            startActivity(intent)
        }
        binding.list3.setOnClickListener{
            val intent = Intent(this, ListActivity3::class.java)
            startActivity(intent)
        }

    }
}