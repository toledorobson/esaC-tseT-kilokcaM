package com.akinguldere.mackoliktestcase

import android.app.Application
import com.akinguldere.mackoliktestcase.di.dataSourceModule
import com.akinguldere.mackoliktestcase.di.networkModule
import com.akinguldere.mackoliktestcase.di.repositoryModule
import com.akinguldere.mackoliktestcase.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MackolikApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MackolikApp)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }

}