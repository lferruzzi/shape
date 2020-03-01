package br.com.lferruzzi.shapetest.ui.main.adapter

import androidx.recyclerview.widget.DiffUtil
import br.com.lferruzzi.shapetest.R
import br.com.lferruzzi.shapetest.data.model.Model
import br.com.lferruzzi.shapetest.databinding.adapter.DataBindingAdapter

class ModelAdapter : DataBindingAdapter<Model>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Model>() {
        override fun areItemsTheSame(oldItem: Model, newItem: Model) = oldItem == newItem
        override fun areContentsTheSame(oldItem: Model, newItem: Model) = oldItem.name == newItem.name
    }

    override fun getItemViewType(position: Int) = R.layout.item_model
}
