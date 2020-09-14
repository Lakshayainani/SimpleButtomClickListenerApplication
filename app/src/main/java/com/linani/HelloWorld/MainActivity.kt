package com.linani.HelloWorld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to the button
        var timesClicked = 0

        button.setOnClickListener {
            timesClicked += 1
//            Toast.makeText(this,"You clicked me!!",Toast.LENGTH_SHORT).show()
            textView.text = "Number of clickes " + timesClicked
        }
        button2.setOnClickListener {
            timesClicked = 0
            textView.text = "Number of click reset to 0"
        }

    }

}