package com.app.idnp_lab06
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.idnp_lab06.R.layout.activity_main
import com.app.idnp_lab06.UserApplication.Companion.prefs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        initUI()
        checkUserValues()
    }

    fun checkUserValues(){
        if(prefs.getName().isNotEmpty()){
            goToDetail()
        }
    }

    fun initUI(){
        btnContinue.setOnClickListener{ accessDToDetail()}
    }

    fun accessDToDetail() {
        if(etName.text.toString().isNotEmpty()){
            prefs.saveName(etName.text.toString())
            prefs.saveModeDark(cbVip.isChecked)
            goToDetail()
        }
        else{

        }
    }
    fun goToDetail(){
        startActivity(Intent(this, ResultActivity::class.java))
    }
}