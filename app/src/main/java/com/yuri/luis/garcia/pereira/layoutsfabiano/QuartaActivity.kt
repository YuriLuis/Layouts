package com.yuri.luis.garcia.pereira.layoutsfabiano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuartaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta)
    }

    fun proximoLayout5(view : View){
        startActivity(Intent(this,QuintaActivity::class.java ).apply {})
    }

    fun voltar3(view : View){
        finish()
    }
}
