package com.yuri.luis.garcia.pereira.layoutsfabiano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TerceiraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)
    }

    fun proximoLayout4(view : View){
        startActivity(Intent(this,QuartaActivity::class.java ).apply {})
    }

    fun voltar2(view : View){
        finish()
    }
}
