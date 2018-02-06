package br.com.livroandroid.hellofirebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "firebase"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ao clicar na notificação os parâmetros são enviados pela intent
        Log.d(TAG, "Nome: ${intent.getStringExtra("nome")}")
        Log.d(TAG, "Sobrenome: ${intent.getStringExtra("sobrenome")}")
    }
}
