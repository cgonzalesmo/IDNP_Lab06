package com.app.idnp_lab06

import android.content.Context

class Prefs(val context: Context) {

    val SHARED_NAME = "MyDataBase"
    val SHARED_USERNAME = "username"
    val SHARED_MODEDARK = "modedark"
    val storage = context.getSharedPreferences(SHARED_NAME, 0)

    fun saveName(name:String){
        storage.edit().putString(SHARED_USERNAME, name).apply()
    }

    fun saveModeDark(vip:Boolean){
        storage.edit().putBoolean(SHARED_MODEDARK, vip).apply()
    }

    fun getName():String{
        return storage.getString(SHARED_USERNAME,"")!!
    }

    fun getModeDark():Boolean{
        return storage.getBoolean(SHARED_MODEDARK,false)
    }

    fun wipe(){
        storage.edit().clear().apply()
    }

}