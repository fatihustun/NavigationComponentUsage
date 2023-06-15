package com.example.navigationcomponentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentusage.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonHomeProfile.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.passingtoProfileScreen)
        }

        binding.buttonHomeContact.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.passingtoContactScreen)
        }

        return binding.root
    }
}