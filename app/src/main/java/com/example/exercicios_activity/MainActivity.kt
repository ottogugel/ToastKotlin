package com.example.exercicios_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Chamado na criação da activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        customToast("OnCreate")
    }

    // Após onStop, caso reiniciada.
    override fun onRestart() {
        super.onRestart()

        customToast("OnRestart")
    }

    // Quando a activity se torna visível ao usuário
    override fun onStart() {
        super.onStart()

        customToast("OnStart")
    }

    // Quando a activity fica disponível para interagir
    override fun onResume() {
        super.onResume()

        customToast("OnResume")
    }

    // Quando a activity perde foco brevemente
    override fun onPause() {
        super.onPause()

        customToast("OnPause")
    }

    // Quando a perda de foco leva a outra activity
    override fun onStop() {
        super.onStop()

        customToast("OnStop")
    }

    // Quando o desenvolvedor chama finish() ou quando
// o sistema precisa de memória
    override fun onDestroy() {
        super.onDestroy()

        customToast("OnDestroy")
    }

    fun customToast(text: String) {
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}