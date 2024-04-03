package com.example.avtividadeintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        val outerText : TextView = findViewById(R.id.textView)
        outerText.text = intent.extras?.getString(Intent.EXTRA_TEXT)



    }
}