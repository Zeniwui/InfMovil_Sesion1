package com.example.prueba1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

public const val TAG1 = "Actividad 1"
class MainActivity : AppCompatActivity() {

    val boton: Button by lazy {
        findViewById(R.id.button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d(TAG1, "Estoy en onCreate()")
        if (savedInstanceState == null) {
            Log.d(TAG1, "Bundle es nulo")
        } else {
            Log.d(TAG1, "Bundle no es nulo")
        }
        boton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        // Llama a override fun onClick(v: View?)
        // boton.setOnClickListener(this)
    }

    // override fun onClick(v: View?) {  }

    override fun onStart() {
        super.onStart()
        Log.d(TAG1, "Estoy en onStart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG1, "Estoy en onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG1, "Estoy en onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG1, "Estoy en onPause()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG1, "Estoy en onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG1, "Estoy en onSaveInstanceState()")
        if (outState == null) {
            Log.d(TAG1, "Bundle es nulo")
        } else {
            Log.d(TAG1, "Bundle no es nulo")
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG1, "Estoy en onRestart()")
    }
}