package com.akinguldere.mackoliktestcase.ui.news

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.akinguldere.mackoliktestcase.R
import com.akinguldere.mackoliktestcase.databinding.FragmentNewsBinding
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class NewsFragment : Fragment() {

    private val viewModel: NewsFragmentViewModel by viewModel { parametersOf() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentNewsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_news, container, false)

        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )

        viewModel.newsList.observe(viewLifecycleOwner) {

            val myAdapter = NewsRecyclerViewAdapter(it.news) { link ->
                val intent = Intent(context, WebViewActivity::class.java)
                intent.putExtra("url", link)
                requireActivity().startActivity(intent)
            }
            binding.recyclerView.adapter = myAdapter
        }

        return binding.root;
    }

}