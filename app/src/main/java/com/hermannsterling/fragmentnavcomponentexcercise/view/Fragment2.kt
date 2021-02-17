package com.hermannsterling.fragmentnavcomponentexcercise.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.hermannsterling.fragmentnavcomponentexcercise.databinding.FragmentTwoBinding

class Fragment2 : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    private val arguments by navArgs<Fragment2Args>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentTwoBinding.inflate(layoutInflater, container, false)
        .also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvDisplay.text = arguments.input

        binding.btnFirstHalf.setOnClickListener {

            val input = binding.tvDisplay.text.toString()
                .substring(binding.tvDisplay.text.length / 2)
            val action = Fragment2Directions.actionFragment2ToFragment3(input)
            findNavController().navigate(action)
        }

        binding.btnSecondHalf.setOnClickListener {

            val input = binding.tvDisplay.text.toString()
                .substring(binding.tvDisplay.text.length / 2, binding.tvDisplay.text.length)
            val action = Fragment2Directions.actionFragment2ToFragment3(input)
            findNavController().navigate(action)
        }
    }
}