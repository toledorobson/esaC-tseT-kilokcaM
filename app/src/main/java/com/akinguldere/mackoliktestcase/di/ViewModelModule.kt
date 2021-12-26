package com.akinguldere.mackoliktestcase.di

import com.akinguldere.mackoliktestcase.ui.matches.MatchesFragmentViewModel
import com.akinguldere.mackoliktestcase.ui.news.NewsFragmentViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MatchesFragmentViewModel(repository = get()) }
    viewModel { NewsFragmentViewModel(repository = get()) }
}