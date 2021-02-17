package com.hermannsterling.fragmentnavcomponentexcercise.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hermannsterling.fragmentnavcomponentexcercise.databinding.FragmentOneBinding


class Fragment1 : Fragment() {
    private lateinit var binding: FragmentOneBinding
    private var listener: FragmentListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentOneBinding.inflate(layoutInflater, container, false)
        .also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSend.setOnClickListener {
            val input = binding.etUserInput.text.toString()
            if (input.isEmpty())
                binding.etUserInput.hint = "The text field can't be empty"
            else {
                val action = Fragment1Directions.actionFragment1ToFragment2(input)
                findNavController().navigate(action)
            }


        }
    }
}
