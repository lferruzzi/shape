package br.com.lferruzzi.shapetest.di

import br.com.lferruzzi.shapetest.data.repository.ModelRepository
import br.com.lferruzzi.shapetest.ui.main.MainFragmentViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ApplicationModule {
    val appModule = module {
        viewModel { MainFragmentViewModel(get()) }
        single { ModelRepository() }
    }
}
