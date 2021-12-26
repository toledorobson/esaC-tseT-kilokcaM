package com.akinguldere.mackoliktestcase.data.repository

import com.akinguldere.mackoliktestcase.data.remote.RemoteDataSource

class RepositoryImpl(private val remoteDataSource: RemoteDataSource) : Repository {

    override suspend fun getNews() =
        remoteDataSource.getNews()

    override suspend fun getMatches() =
        remoteDataSource.getMatches()
}