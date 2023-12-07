package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentSixthBinding
import android.content.Intent

class SixthFragment : Fragment() {

    private var _binding: FragmentSixthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSixthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFourth.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_FifthFragment)
        }

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SixthFragment_to_FirstFragment)
        }
        binding.buttonLaunchMaps.setOnClickListener {
            val intent = Intent(requireActivity(), MapsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
