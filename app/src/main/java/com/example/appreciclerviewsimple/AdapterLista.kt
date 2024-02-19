package com.example.appreciclerviewsimple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appreciclerviewsimple.databinding.ItemListaBinding

class AdapterLista(private var lstItem : List<String>) : RecyclerView.Adapter<AdapterLista.ViewHolder>() {
    inner class ViewHolder(val binding: ItemListaBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent , false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvnombre.setText(lstItem.get(position))
    }
}