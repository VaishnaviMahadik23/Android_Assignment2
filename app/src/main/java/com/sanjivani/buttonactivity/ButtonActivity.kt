package com.sanjivani.buttonactivity

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ButtonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        // Find Views
        val textView: TextView = findViewById(R.id.myTextView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Change Text
        button1.setOnClickListener {
            textView.text = "Text Changed!"
        }

        // Button 2: Change Height
        button2.setOnClickListener {
            val params = textView.layoutParams
            params.height = 300 // Set height in pixels
            textView.layoutParams = params
        }

        // Button 3: Center Text
        button3.setOnClickListener {
            val params = textView.layoutParams as ViewGroup.MarginLayoutParams
            params.topMargin = 0
            textView.layoutParams = params
            textView.gravity = Gravity.CENTER
        }
    }
}
