package com.akinguldere.mackoliktestcase.data.remote

import com.akinguldere.mackoliktestcase.data.service.MackolikService

class RemoteDataSourceImpl(private val service: MackolikService) : RemoteDataSource {

    override suspend fun getNews() = service.getNews()

    override suspend fun getMatches() = service.getMatches()

}