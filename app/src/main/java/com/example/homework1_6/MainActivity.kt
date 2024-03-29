package com.example.homework1_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.homework1_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.counterLv.observe(this) { result ->
            binding.tvResult.text = result.toString()
        }

        with(binding) {
            btnInc.setOnClickListener() {
                viewModel.inc()
            }
            btnDec.setOnClickListener() {
                viewModel.dec()
            }
        }
    }
}