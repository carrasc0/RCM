package com.registro.rcm.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.registro.rcm.R
import com.registro.rcm.model.BuscaNovio
import com.registro.rcm.utils.inflate
import com.registro.rcm.utils.normalGlideAssigment
import com.registro.rcm.utils.titleBuscaNovio
import kotlinx.android.synthetic.main.design_busca_novio.view.*

class BuscaNovioAdapter(private var items: MutableList<BuscaNovio>) :
    RecyclerView.Adapter<BuscaNovioAdapter.NovioVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovioVH {
        val inflatedView = parent.inflate(R.layout.design_busca_novio, false)
        return NovioVH(inflatedView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: NovioVH, position: Int) {
        holder.bind(items[position])
    }


    inner class NovioVH(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private var novio: BuscaNovio? = null

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(novio: BuscaNovio) {
            this.novio = novio
            normalGlideAssigment(itemView.context, "", itemView.novioIM)
            itemView.novioTitleTV.text = titleBuscaNovio(novio)
            itemView.novioDescpTV.text = novio.descp
        }

        override fun onClick(view: View?) {
            Toast.makeText(itemView.context, "Pressed ${novio?.mascota?.name}", Toast.LENGTH_SHORT).show()
        }

    }

}