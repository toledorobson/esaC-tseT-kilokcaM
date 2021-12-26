package com.akinguldere.mackoliktestcase.di

import com.akinguldere.mackoliktestcase.data.remote.RemoteDataSource
import com.akinguldere.mackoliktestcase.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}