package com.akinguldere.mackoliktestcase.ui.news

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.akinguldere.mackoliktestcase.R
import com.akinguldere.mackoliktestcase.databinding.ItemNewsBinding
import com.akinguldere.mackoliktestcase.model.news.NewsItem


class NewsRecyclerViewAdapter(var items: List<NewsItem>, val action: (String) -> Unit) :
    RecyclerView.Adapter<NewsRecyclerViewAdapter.NewsRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataBindingUtil.inflate<ItemNewsBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_news,
            parent,
            false
        ).let { NewsRecyclerViewHolder(it) }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: NewsRecyclerViewHolder, position: Int) =
        holder.bind(items[position])

    inner class NewsRecyclerViewHolder(private val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                action(
                    items[bindingAdapterPosition].link
                )
            }
        }

        fun bind(item: NewsItem) {
            binding.apply {
                news = item
                executePendingBindings()
            }
        }

    }
}