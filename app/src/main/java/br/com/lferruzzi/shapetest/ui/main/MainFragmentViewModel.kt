package br.com.lferruzzi.shapetest.ui.main

import androidx.lifecycle.ViewModel
import br.com.lferruzzi.shapetest.data.repository.ModelRepository

class MainFragmentViewModel(modelRepository: ModelRepository) : ViewModel() {
    val models = modelRepository.models
}
