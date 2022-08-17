package com.example.messanger

import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editTextMsg: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextMsg = findViewById(R.id.message)
    }

    fun onClickSendMsg(view: View) {
        val message : String = editTextMsg.text.toString()
        val intent : Intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(EXTRA_TEXT, message)

        val chosenIntent : Intent = Intent.createChooser(intent, getString(R.string.chooser_title))

        startActivity(chosenIntent)
    }
}