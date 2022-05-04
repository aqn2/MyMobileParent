package com.example.learningnavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.learningnavigation.databinding.FragmentGalleryBinding
import com.example.learningnavigation.databinding.FragmentGreeting2Binding

class Greeting2Fragment : Fragment() {


    private var _binding: FragmentGreeting2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentGreeting2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView4
        textView.text = "This is the Gallery2 Fragment"

        // to receive information from a bundle, use the built in variable
        // arguments

        val message = arguments?.getString(GreetingFragment.BUNDLE_GREETING2_INFO) ?: ""
        textView.text = "This is the Gallery Fragment\n$message"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}