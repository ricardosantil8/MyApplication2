package ipvc.estg.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ipvc.estg.myapplication.R
import ipvc.estg.myapplication.dataclasses.Estudante
import kotlinx.android.synthetic.main.recyclerline.view.*


class LineAdapter(val List: ArrayList<Estudante>):RecyclerView.Adapter<LineViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {

        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recyclerline, parent, false);
        return LineViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val currentPlace = List[position]

        holder.nome.text = currentPlace.nome
        holder.escola.text = currentPlace.escola
        holder.nnumero.text = currentPlace.numero.toString()
    }
}
class LineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val nome = itemView.nome
    val escola = itemView.escola
    var nnumero = itemView.numero

}

