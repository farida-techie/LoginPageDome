package com.malkinfo.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setEmail()

    }
    fun setEmail(){
        /**set mail Address*/
       if (ContactsContract.CommonDataKinds.Email.ADDRESS == edMail.editText!!.text.toString()){
           Toast.makeText(this,"You are login",Toast.LENGTH_SHORT).show()
           edMail.error = null
       }else{
           edMail.error = "Invalid Email"
       }

    }
}