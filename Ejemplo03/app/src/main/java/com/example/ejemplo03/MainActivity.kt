package com.example.ejemplo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText: EditText
    lateinit var nameButton: Button
    lateinit var nameDisplayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BindView()
        addEventListener()

    }

    fun BindView() {
        nameEditText = findViewById(R.id.et_name)
        nameButton = findViewById(R.id.bt_send_name)
        nameDisplayTextView = findViewById(R.id.tv_display_name)
    }

    fun addEventListener() {
        nameButton.setOnClickListener {
            var name = nameEditText.text

            if(name.isEmpty()) {
                nameDisplayTextView.text = getString(R.string.notification_nombre)
            } else {
                nameDisplayTextView.text = name
            }
        }
    }
}
