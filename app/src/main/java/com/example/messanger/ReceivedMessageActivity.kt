package com.example.messanger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceivedMessageActivity : AppCompatActivity() {

    private lateinit var textViewReceivedMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_received_message)

        textViewReceivedMessage = findViewById(R.id.textViewReceivedMessage)
        val intent = intent
        val msg = intent.getStringExtra("msg")

        textViewReceivedMessage.text = msg


    }
}