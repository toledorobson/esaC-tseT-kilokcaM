package com.akinguldere.mackoliktestcase.ui.matches

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.akinguldere.mackoliktestcase.data.repository.Repository
import com.akinguldere.mackoliktestcase.model.matches.MatchesResponse
import kotlinx.coroutines.Dispatchers

class MatchesFragmentViewModel(private val repository: Repository) : ViewModel() {

    val matchesList : LiveData<MatchesResponse> = liveData(Dispatchers.IO) {
        isLoading.postValue(true)
        emit(repository.getMatches())
        isLoading.postValue(false)
    }

    val isLoading = MutableLiveData<Boolean>()

}