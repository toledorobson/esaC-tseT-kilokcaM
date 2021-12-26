package com.akinguldere.mackoliktestcase.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.akinguldere.mackoliktestcase.R
import com.akinguldere.mackoliktestcase.base.BaseActivity
import com.akinguldere.mackoliktestcase.databinding.ActivityMainBinding
import com.akinguldere.mackoliktestcase.ui.matches.MatchesFragment
import com.akinguldere.mackoliktestcase.ui.news.NewsFragment

class MainActivity : BaseActivity() {

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {
            lifecycleOwner = this@MainActivity

            expandable.parentLayout.setOnClickListener { expandable.toggleLayout() }
            expandable.secondLayout.findViewById<Button>(R.id.button0)
                .setOnClickListener {
                    expandable.parentLayout.findViewById<TextView>(R.id.title_text_view).text =
                        "NEWS"
                    loadNewsFragment()
                    expandable.toggleLayout()
                }
            expandable.secondLayout.findViewById<Button>(R.id.button1)
                .setOnClickListener {
                    expandable.parentLayout.findViewById<TextView>(R.id.title_text_view).text =
                        "SCORES"
                    loadMatchesFragment()
                    expandable.toggleLayout()
                }
        }

        loadNewsFragment()
    }

    private fun loadNewsFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.fragmentContainer.id, NewsFragment()).commitAllowingStateLoss()
    }

    private fun loadMatchesFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.fragmentContainer.id, MatchesFragment())
            .commitAllowingStateLoss()
    }
}