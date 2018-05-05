package br.com.heiderlopes.demorecyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import br.com.heiderlopes.demorecyclerview.adapter.JogoAdapter
import br.com.heiderlopes.demorecyclerview.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_de_jogos.*

class ListaDeJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_jogos)

        rvMeusJogos.adapter = JogoAdapter(jogos(), this, {

            //Ir de uma tela para outra, startActivity deve ter intent + a tela
            //que esta "this" e a tela que vc vai com o "::class.java"
            val intent = Intent(this, DetalheJogoActivity::class.java)

            intent.putExtra("jogo", it)

            startActivity(intent)

            //Log.i("TAG", "MEU ITEM")
        })

        //Grid
        //val layoutManager = GridLayoutManager(this, 2)


        //Grade escalonável
        /*val layoutManager = StaggeredGridLayoutManager(
                2, StaggeredGridLayoutManager.VERTICAL)*/

        //Lista na horizontal
        //val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        //Lista na vertical
        val layoutManager = LinearLayoutManager(this)

        rvMeusJogos.layoutManager = layoutManager
    }

    private fun jogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.godofwarcapa,
                        "God of War",
                        2018,
                        getString(R.string.godofwardescricao),
                        R.drawable.godofwar), Jogo(
                R.drawable.soniccapa,
                "Sonic",
                2018,
                "Jogo do Sonic",
                R.drawable.sonic
        ))
    }
}
