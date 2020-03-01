package br.com.lferruzzi.shapetest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.lferruzzi.shapetest.databinding.MainFragmentBinding
import br.com.lferruzzi.shapetest.ui.main.adapter.ModelAdapter
import org.koin.android.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {
    private val mainViewModel: MainFragmentViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = MainFragmentBinding.inflate(inflater).root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ModelAdapter()

        DataBindingUtil.getBinding<MainFragmentBinding>(requireView())?.run {
            rvModels.adapter = adapter
        }

        mainViewModel.models.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })
    }
}
