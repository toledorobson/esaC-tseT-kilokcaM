package com.akinguldere.mackoliktestcase.data.service

import com.akinguldere.mackoliktestcase.model.matches.MatchesResponse
import com.akinguldere.mackoliktestcase.model.news.NewsResponse
import retrofit2.http.GET

interface MackolikService {

    @GET("news")
    suspend fun getNews(): NewsResponse

    @GET("matches")
    suspend fun getMatches(): MatchesResponse
}