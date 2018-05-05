package br.com.heiderlopes.demorecyclerview

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import br.com.heiderlopes.demorecyclerview.model.Jogo
import kotlinx.android.synthetic.main.activity_detalhe_jogo.*
import kotlinx.android.synthetic.main.meu_jogo_item.*

class DetalheJogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_jogo)
        setSupportActionBar(toolbar)

        val jogo = intent.getParcelableExtra<Jogo>("jogo")
        toolbar_layout.title = jogo.titulo
        tvDescricao.text = jogo.descricao
        ivBanner.setImageDrawable(ContextCompat.getDrawable(this,jogo.bannerId))

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
