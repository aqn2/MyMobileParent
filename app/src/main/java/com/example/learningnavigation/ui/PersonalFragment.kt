package com.example.learningnavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.learningnavigation.R
import com.example.learningnavigation.databinding.FragmentGreetingBinding

class PersonalFragment : Fragment() {

    companion object {
        val BUNDLE_GREETING2_INFO = "greeting2 info"
    }

    private var _binding: FragmentGreetingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentGreetingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView3
        textView.text = "This is the Greeting Fragment"

        binding.buttonGreetingSubmit.setOnClickListener {
            // to move between fragments, we don't use intent
            // we find the nav controller and tell it to execute an action
            // to send information between fragments, we use a bundle instead of putting
            // extras into an intent.
            val bundle = Bundle()
            bundle.putString(PersonalFragment.BUNDLE_GREETING2_INFO, "Hello, ${binding.editTextTextPersonName?.text ?: "name"}.")
            // with a bundle, just add it as a parameter
            root.findNavController().navigate(R.id.action_nav_greeting_to_nav_greeting2, bundle)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}