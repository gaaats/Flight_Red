package com.generamobile.headso.frnjgtjgtj

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headso.R
import com.generamobile.headso.frjgthtg.JIfjrhfrhurfhuhrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val viewMainModel by viewModel <JIfjrhfrhurfhuhrf>(named("MainModel"))

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewMainModel.gthyyujujujuj(this@MainActivity)
    }
}