package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagePlay = findViewById<ImageView>(R.id.imageViewPlay)
        val imagePause = findViewById<ImageView>(R.id.imageViewPause)

        imagePlay.setOnClickListener(View.OnClickListener {
            imagePlay.visibility=View.GONE
            imagePause.visibility= View.VISIBLE
        })
        imagePause.setOnClickListener(View.OnClickListener {
            imagePlay.visibility =View.VISIBLE
            imagePause.visibility =View.GONE
        })
    }
}