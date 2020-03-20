package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }

    fun profile(): Boolean {
        if (editText.text.toString().isEmpty()) {
            editText.error = "this field cant be empty"

            return false
        } else if (password.text.toString().isEmpty()) {
            password.error = "number cant be empty"
            return false
        } else if (editText1.text.toString().isEmpty()) {
            editText1.error = "this feild cant be empty"
            return false
        }
        return true
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button ->
                if(profile()){
                    Toast.makeText(this,"done",Toast.LENGTH_SHORT).show()
                }
        }
    }
}
