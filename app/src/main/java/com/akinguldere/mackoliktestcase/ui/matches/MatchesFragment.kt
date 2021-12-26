package com.akinguldere.mackoliktestcase.ui.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.akinguldere.mackoliktestcase.R
import com.akinguldere.mackoliktestcase.databinding.FragmentMatchesBinding
import com.akinguldere.mackoliktestcase.extension.dateConvert
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MatchesFragment : Fragment() {

    private val viewModel: MatchesFragmentViewModel by viewModel { parametersOf() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMatchesBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_matches, container, false)

        viewModel.matchesList.observe(viewLifecycleOwner) {
            val myAdapter = MatchesRecyclerViewAdapter(it.matches)
            binding.apply {
                recyclerView.adapter = myAdapter
                dateTextView.text = it.date.dateConvert
            }

        }

        return binding.root;
    }

}