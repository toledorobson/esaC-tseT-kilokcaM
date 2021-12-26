package com.akinguldere.mackoliktestcase.di

import com.akinguldere.mackoliktestcase.data.repository.Repository
import com.akinguldere.mackoliktestcase.data.repository.RepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<Repository> { RepositoryImpl(remoteDataSource = get()) }
}