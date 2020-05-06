package com.yuri.luis.garcia.pereira.layoutsfabiano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun proximoLayout2(view : View){
        startActivity(Intent(this,SegundaActivity::class.java ).apply {})
    }
}
