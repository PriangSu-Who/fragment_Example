package com.example.fragments_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragments_example.databinding.ActivityMainBinding
import com.example.fragments_example.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.loginB.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
        }

        binding.profileB.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }


        return binding.root

    }

}