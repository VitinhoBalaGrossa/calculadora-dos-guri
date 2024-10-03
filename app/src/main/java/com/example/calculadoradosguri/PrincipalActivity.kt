package com.example.calculadoradosguri

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

// ":  AppCompactActivity()" herda ou importa as funções da tela do kotlin
class PrincipalActivity : AppCompatActivity() {


    //var nome_aplicativo = "Calculadora dos Guri";
    val nome_aplicativo_string: String ="Calculadora dos Guri" ;
    val valor_inteiro: Int = 1250;
    val valor_com_ponto: Float = 6.9F;
    val aprovado: Boolean = false /// apenas true ou false;
    val sigla_do_app: Char = "C" // só permite uma letra com aspas simples;
    const val nome_aplicativo: String = "Calculadora dos Guri"

    // const => faz com que a variavel não seja alterada depois


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // seta o conteúdo da view como o arquivo layout principal
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtNumero: EditText = findViewById(R.id.edtNumero)

        btnCalcular.setOnClickListener {
            val text = "Salve salve vagabundagem"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
        }
    }

    fun  eventoClickBotaoCalcular() {


    }

}