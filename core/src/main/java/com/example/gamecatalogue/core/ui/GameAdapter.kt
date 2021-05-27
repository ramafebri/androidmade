package com.example.gamecatalogue.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gamecatalogue.core.R
import com.example.gamecatalogue.core.databinding.ItemListBinding
import com.example.gamecatalogue.core.domain.model.Game
import java.util.ArrayList

class GameAdapter: RecyclerView.Adapter<GameAdapter.ListViewHolder>() {
    private var listData = ArrayList<Game>()
    var onItemClick: ((Game) -> Unit)? = null

    fun setData(newListData: List<Game>?) {
        if (newListData == null) return
        listData.clear()
        listData.addAll(newListData)
        notifyDataSetChanged()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListBinding.bind(itemView)
        fun bind(data: Game) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(data.backgroundImage)
                    .into(imgPoster)
                tvItemTitle.text = data.name
                tvItemRelease.text = data.released
                tvItemRating.text = data.rating.toString()
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[bindingAdapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameAdapter.ListViewHolder =
        ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: GameAdapter.ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount()= listData.size
}