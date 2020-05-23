package com.example.databinding

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var insideCounter = Counter("Inside", 0)
    var outsideCounter = Counter("Outside", 0)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.insideCounter = insideCounter
        binding.outsideCounter = outsideCounter

        addCounterActions()
    }

    private fun addCounterActions() {
        binding.apply {
            button_outside_add.setOnClickListener {
                binding.outsideCounter!!.count++
            }

            button_inside_add.setOnClickListener {
                insideCounter.count++
            }
        }
    }
}
