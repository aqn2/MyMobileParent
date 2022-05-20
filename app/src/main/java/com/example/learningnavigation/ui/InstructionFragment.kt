package com.example.learningnavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.annotation.VisibleForTesting
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.learningnavigation.R
import com.example.learningnavigation.databinding.FragmentInstructionsBinding
import java.util.Calendar.getInstance

class InstructionFragment : Fragment() {

    companion object {
        val BUNDLE_GALLERY_INFO = "gallery info"
    }


    private var _binding: FragmentInstructionsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        _binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
