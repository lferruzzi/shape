package br.com.lferruzzi.shapetest.databinding.adapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.lferruzzi.shapetest.BR

class DataBindingViewHolder<T>(private val binding: ViewDataBinding) : ViewHolder(binding.root) {

    fun bind(item: T) {
        binding.setVariable(BR.item, item)
        binding.executePendingBindings()
    }
}
