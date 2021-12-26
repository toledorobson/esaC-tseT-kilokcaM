package com.akinguldere.mackoliktestcase.ui.matches

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.akinguldere.mackoliktestcase.R
import com.akinguldere.mackoliktestcase.databinding.ItemMatchBinding
import com.akinguldere.mackoliktestcase.model.matches.MatchItem

class MatchesRecyclerViewAdapter(var items: List<MatchItem>) :
    RecyclerView.Adapter<MatchesRecyclerViewAdapter.MatchesRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ItemMatchBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_match,
            parent,
            false
        ).let { MatchesRecyclerViewHolder(it) }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MatchesRecyclerViewHolder, position: Int) =
        holder.bind(items[position], position)

    inner class MatchesRecyclerViewHolder(private val binding: ItemMatchBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
            }


        }

        fun bind(item: MatchItem, position: Int) {
            binding.apply {
                match = item
                backgroundColor = if (position.mod(2) == 0) R.color.white_dark else R.color.white
                executePendingBindings()
            }
        }

    }
}