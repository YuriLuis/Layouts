package com.yuri.luis.garcia.pereira.layoutsfabiano

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SextaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sexta)
    }


    fun voltar5(view : View){
        finish()
    }
}
