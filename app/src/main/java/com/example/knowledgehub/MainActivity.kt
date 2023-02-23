package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var beginBtn=findViewById<Button>(R.id.button)
        beginBtn.setOnClickListener {
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }

        var btnContact=findViewById<TextView>(R.id.contact)
        btnContact.setOnClickListener{
            val u: Uri = Uri.parse("tel:" + "7505794230")
            intent=Intent(Intent.ACTION_DIAL,u)
            startActivity(intent)
        }

    }
}