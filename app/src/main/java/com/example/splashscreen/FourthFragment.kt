package com.example.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.splashscreen.databinding.FragmentFourthBinding


@Suppress("DEPRECATION")
class FourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFourth.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_FifthFragment)
        }

        binding.buttonTo3.setOnClickListener {
            findNavController().navigate(R.id.action_FourthFragment_to_ThirdFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Indicate that this fragment has an options menu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    // Create options menu
    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.options_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    // Handle options menu item clicks
    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> Toast.makeText(requireContext(), "About Selected", Toast.LENGTH_SHORT)
                .show()

            R.id.settings -> Toast.makeText(
                requireContext(),
                "Settings Selected",
                Toast.LENGTH_SHORT
            ).show()

            R.id.exit -> Toast.makeText(requireContext(), "Exit Selected", Toast.LENGTH_SHORT)
                .show()

        }
        return super.onOptionsItemSelected(item)
    }
}


