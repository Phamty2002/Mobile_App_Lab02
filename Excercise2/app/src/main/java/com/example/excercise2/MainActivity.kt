package com.example.excercise2

import android.graphics.Color
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroupColors: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroupColors = findViewById(R.id.radioGroupColors)
        radioGroupColors.setOnCheckedChangeListener { group, checkedId ->
            val colorId = when (checkedId) {
                R.id.radioButtonRed -> Color.RED
                R.id.radioButtonGreen -> Color.GREEN
                R.id.radioButtonBlue -> Color.BLUE
                R.id.radioButtonGray -> Color.GRAY
                else -> Color.WHITE
            }
            window.decorView.setBackgroundColor(colorId)
        }
    }
}