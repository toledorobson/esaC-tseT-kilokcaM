package com.akinguldere.mackoliktestcase.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.akinguldere.mackoliktestcase.data.repository.Repository
import com.akinguldere.mackoliktestcase.model.matches.MatchesResponse
import com.akinguldere.mackoliktestcase.model.news.NewsResponse
import kotlinx.coroutines.Dispatchers

class NewsFragmentViewModel(private val repository: Repository) : ViewModel() {

    val newsList : LiveData<NewsResponse> = liveData(Dispatchers.IO) {
        isLoading.postValue(true)
        emit(repository.getNews())
        isLoading.postValue(false)
    }

    val isLoading = MutableLiveData<Boolean>()

}