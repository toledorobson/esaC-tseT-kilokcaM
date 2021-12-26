package com.akinguldere.mackoliktestcase.data.repository

import com.akinguldere.mackoliktestcase.model.matches.MatchesResponse
import com.akinguldere.mackoliktestcase.model.news.NewsResponse

interface Repository {

    suspend fun getNews() : NewsResponse

    suspend fun getMatches() : MatchesResponse

}