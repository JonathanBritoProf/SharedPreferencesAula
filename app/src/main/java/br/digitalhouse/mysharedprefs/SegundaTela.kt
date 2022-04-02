package br.digitalhouse.mysharedprefs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        //cria o shared preferences
        var sharedPreferences = getSharedPreferences("mySharedPreferences", MODE_PRIVATE)
        //resgata o valor do shared prefs
        var nome = sharedPreferences.getString("nome", "nenhum")
        var idade = sharedPreferences.getString("idade", "0 anos")
        var textView = findViewById<TextView>(R.id.textView)
        textView.text = "Ola $nome você tem $idade anos"
    }
}