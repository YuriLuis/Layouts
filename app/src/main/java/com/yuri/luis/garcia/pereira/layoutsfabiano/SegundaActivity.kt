package com.yuri.luis.garcia.pereira.layoutsfabiano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
    }

    fun proximoLayout3(view : View){
        startActivity(Intent(this,TerceiraActivity::class.java ).apply {})
    }

    fun voltar1(view : View){
        finish()
    }
}
