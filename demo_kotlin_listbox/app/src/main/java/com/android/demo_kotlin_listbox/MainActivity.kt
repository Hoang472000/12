package com.android.demo_kotlin_listbox

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var textView1: TextView
    private lateinit var textView12: TextView
    private lateinit var textView13: TextView
    private lateinit var textView14: TextView
    private lateinit var textView15: TextView
    private lateinit var constraintLayout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1=textView
        textView12=textView2
        textView13=textView3
        textView14=textView4
        textView15=textView5
        constraintLayout=container
        setListeners()
    }

    private fun makeColored(view: View){
        when (view.id){
            R.id.textView -> view.setBackgroundColor(Color.BLACK)
            R.id.textView2 ->view.setBackgroundColor(Color.BLUE)
            R.id.textView3 ->view.setBackgroundColor(Color.CYAN)
            R.id.textView4 ->view.setBackgroundColor(Color.DKGRAY)
            R.id.textView5 ->view.setBackgroundColor(Color.GREEN)
            else ->view.setBackgroundResource(R.drawable.ic_launcher_background)
        }
    }
    fun setListeners(){
        val clickableView: List<View> =
            listOf(textView1,textView12,textView13,textView14,textView15,constraintLayout)

        for (item in clickableView){
            item.setOnClickListener{makeColored(it)}
        }
    }


}