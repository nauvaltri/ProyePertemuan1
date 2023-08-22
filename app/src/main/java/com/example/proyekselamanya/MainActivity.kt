package com.example.proyekselamanya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyekselamanya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btn1.setOnClickListener{
                Toast.makeText(this@MainActivity,"Hello World",Toast.LENGTH_LONG).show()
            }
        }
    }
}