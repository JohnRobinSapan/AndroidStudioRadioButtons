package com.example.radiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
           when (checkedId) {
               radioButton1.id -> {
                   showToast(radioButton1.text.toString())
                   textView.text = radioButton1.text
               }
               radioButton2.id -> {
                   showToast(radioButton2.text.toString())
                   textView.text = radioButton2.text

               }
               radioButton3.id -> {
                   showToast(radioButton3.text.toString())
                   textView.text = radioButton3.text
               }
           }
        }
    }

    private fun showToast(text: String) {
        if (toast != null) {
            toast?.cancel()
        }

        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast?.setGravity(Gravity.TOP, 0, 200)
        toast?.show()
    }
}
