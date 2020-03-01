package br.com.lferruzzi.shapetest

import android.app.Application
import br.com.lferruzzi.shapetest.di.ApplicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShapeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(ApplicationModule.appModule)
        }
    }
}
