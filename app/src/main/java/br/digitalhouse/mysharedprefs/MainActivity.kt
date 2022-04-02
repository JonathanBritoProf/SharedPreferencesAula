package br.digitalhouse.mysharedprefs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLogar = findViewById<Button>(R.id.btnLogar)
        var txtNome = findViewById<EditText>(R.id.txtNome)
        var txtIdade = findViewById<EditText>(R.id.txtIdade)

        btnLogar.setOnClickListener {
            //cria o shared preferences
            var sharedPreferences = getSharedPreferences("mySharedPreferences", MODE_PRIVATE)
            //cria o editor
           var editor = sharedPreferences.edit()
            //passa chave e valor
            editor.putString("nome",txtNome.text.toString())
            editor.putString("idade",txtIdade.text.toString())
            editor.commit()

            //inicia uma nova tela
            var intent = Intent(this, SegundaTela :: class.java)
            startActivity(intent)


        }


    }
}