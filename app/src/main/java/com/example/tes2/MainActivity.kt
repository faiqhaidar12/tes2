package com.example.tes2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var user =""
    var pass =""

    var username ="Faiq Haidar"
    var password ="5180411090"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnLogin.setOnClickListener{
//           user = etUsername.text.toString()
//           pass = etPassword.text.toString()
//
//           if(user == username && pass == password){
//               Toast.makeText(applicationContext,"Sukses Login",Toast.LENGTH_SHORT).show()
//           }else{
//               Toast.makeText(applicationContext,"Login Gagal! Username Atau Password Salah!",Toast.LENGTH_SHORT).show()
//           }
       }
        fun getValues(): String{
            if(rbJenis1.isChecked){
                return rbJenis1.text.toString()
            }else {
                return rbJenis2.text.toString()
                }
            }
        }
    }
