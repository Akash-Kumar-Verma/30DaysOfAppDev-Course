package com.example.scrollandtextview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)
         btn.setOnClickListener {
             intent= Intent(applicationContext,MainActivity2::class.java)
             startActivity(intent)
         }
        val shareButton=findViewById<Button>(R.id.Sharebutton)
        shareButton.setOnClickListener {
            intent= Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,
                "Hey check out my app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
            intent.type = "text/plain";
            startActivity(intent);
        }
        val cam=findViewById<Button>(R.id.camera)
        cam.setOnClickListener {
            intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}