package com.example.prueba1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

public const val TAG2 = "Actividad 2"
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG2, "Estoy en onStart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG2, "Estoy en onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG2, "Estoy en onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG2, "Estoy en onPause()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG2, "Estoy en onResume()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG2, "Estoy en onSaveInstanceState()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG2, "Estoy en onRestart()")
    }
}