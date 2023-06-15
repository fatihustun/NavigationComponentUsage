package com.example.navigationcomponentusage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentusage.databinding.FragmentContactBinding


class ContactFragment : Fragment() {
    private lateinit var binding: FragmentContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactBinding.inflate(inflater,container,false)

        binding.buttonContact.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.passingtoFormScreen)
        }
        return binding.root
    }

}