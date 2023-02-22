package com.generamobile.headso.gtjogtjigtjigt

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class VebbbbroovvvisActivity2 : AppCompatActivity() {

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            gthyyhjuuj.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        if (!gthyyhjuuj.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }

    lateinit var gthyyhjuuj: BTwoLib
    val hyjuujujuj: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gthyyhjuuj = BTwoLib(this@VebbbbroovvvisActivity2)
        setContentView(gthyyhjuuj)
        gthyyhjuuj.profiter(bghyjyujuujuj())
    }

    private fun bghyjyujuujuj(): String {
        val hyujujuj = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val vfgtgthyhyhyhy = hyjuujujuj.getString("link", null)

        hyujujuj.edit().putString("SAVED_URL", vfgtgthyhyhyhy).apply()
        return hyujujuj.getString("SAVED_URL", vfgtgthyhyhyhy).toString()
    }
}