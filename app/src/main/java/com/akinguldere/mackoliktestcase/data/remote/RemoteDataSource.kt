package com.akinguldere.mackoliktestcase.data.remote

import com.akinguldere.mackoliktestcase.model.matches.MatchesResponse
import com.akinguldere.mackoliktestcase.model.news.NewsResponse

interface RemoteDataSource {

    suspend fun getNews() : NewsResponse

    suspend fun getMatches() : MatchesResponse

}