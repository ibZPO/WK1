package edu.ib.wk1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickButton1(view: View) {

        val input=findViewById<TextView>(R.id.edNumber1)
        val userInput=input.text.toString()
        val message="User typed: ".plus(userInput)

        val mToast= Toast.makeText(applicationContext,message,Toast.LENGTH_LONG)
        mToast.show()
    }
}