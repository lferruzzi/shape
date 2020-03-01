package br.com.lferruzzi.shapetest.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.lferruzzi.shapetest.data.model.Model

class ModelRepository {
    val models: LiveData<List<Model>> = MutableLiveData(listOf(Model("Shape")))
}
