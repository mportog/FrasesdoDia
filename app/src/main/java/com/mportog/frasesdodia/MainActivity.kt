package com.mportog.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView
    val frases = arrayOf(
        "“O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis” – José de Alencar",
        " “Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo” – Ayrton Senna",
        "“Não crie limites para si mesmo. Você deve ir tão longe quanto sua mente permitir. O que você mais quer pode ser conquistado” – Mary Kay Ash",
        " “Nenhum obstáculo será grande se a sua vontade de vencer for maior” – Autor desconhecido",
        "“Dificuldades preparam pessoas comuns para destinos extraordinários” C.S Lewis",
        " “Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso” – Andrew Carnegie",
        " “Só existem dois dias do ano em que você não pode fazer nada: um se chama ontem e outro amanhã” – Dalai Lama"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<View>(R.id.texto_frase) as TextView

    }

    fun gerarFrase(view: View){
    val totalItens = frases.size
        val rand = Random().nextInt(totalItens)
        texto.setText(frases[rand])
    }
}