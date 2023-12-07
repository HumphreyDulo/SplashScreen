package com.example.splashscreen

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentFifthBinding

@Suppress("DEPRECATION")
class FifthFragment : Fragment(R.layout.fragment_fifth) {

    private var _binding: FragmentFifthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFifthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFifth.setOnClickListener {
            findNavController().navigate(R.id.action_FifthFragment_to_FourthFragment)
        }

        binding.buttonToSecondFifth.setOnClickListener {
            findNavController().navigate(R.id.action_FifthFragment_to_SixthFragment)
        }
        setHasOptionsMenu(true) // Indicates that this fragment has an options menu
    }

    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.options_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.settings -> {
                // Handle settings click
                return true
            }

            R.id.about -> {
                // Handle about click
                return true
            }

            R.id.exit -> {
                // Handle exit click
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

