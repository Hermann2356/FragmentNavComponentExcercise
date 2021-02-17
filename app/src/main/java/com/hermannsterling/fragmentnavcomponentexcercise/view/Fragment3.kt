package com.hermannsterling.fragmentnavcomponentexcercise.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.hermannsterling.fragmentnavcomponentexcercise.databinding.FragmentThreeBinding

class Fragment3 : Fragment() {
    private lateinit var binding: FragmentThreeBinding
    private val arguments by navArgs<Fragment2Args>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentThreeBinding.inflate(layoutInflater, container, false)
        .also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvDisplay.text = arguments.input
    }

}