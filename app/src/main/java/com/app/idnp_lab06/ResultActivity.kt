package com.app.idnp_lab06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.app.idnp_lab06.UserApplication.Companion.prefs
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initUI()
    }


    fun initUI(){
        btnBack.setOnClickListener{
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName()
        tvName.text = "Bienvenido $userName"
        if(prefs.getModeDark()){
            setVipColorBackground()
        }
    }

    fun setVipColorBackground() {
        container.setBackgroundColor(ContextCompat.getColor(this, R.color.dark))
    }
}