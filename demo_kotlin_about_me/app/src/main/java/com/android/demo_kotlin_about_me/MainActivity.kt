package com.android.demo_kotlin_about_me

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var textView1: TextView
    private lateinit var editText: EditText
    private lateinit var btnHandler: Button
    private lateinit var btnHandler1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=text
        editText=edit_text
        btnHandler=button
        btnHandler1=button1
        textView.setText("HoangCV")

        btnHandler.setOnClickListener{
            HandleClick(it)
        }
        btnHandler1.setOnClickListener{
            click(it)
        }
    }

    @SuppressLint("ResourceAsColor")
    fun HandleClick(view: View) {
        val inputMethodManager= getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
        textView.text=editText.text
        editText.visibility=View.GONE
        btnHandler.visibility=View.GONE
        btnHandler1.visibility=View.VISIBLE
        btnHandler1.setBackgroundColor(R.color.black)
        editText.setText("")


    }

    fun click(view: View) {
        editText.visibility=View.VISIBLE
        btnHandler1.visibility=View.GONE
        btnHandler.visibility=View.VISIBLE
    }
}