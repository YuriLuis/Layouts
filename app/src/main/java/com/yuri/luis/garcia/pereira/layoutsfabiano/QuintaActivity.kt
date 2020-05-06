package com.yuri.luis.garcia.pereira.layoutsfabiano

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuintaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quinta)
    }

    fun proximoLayout6(view : View){
        startActivity(Intent(this,SextaActivity::class.java ).apply {})
    }

    fun voltar4(view : View){
        finish()
    }
}
