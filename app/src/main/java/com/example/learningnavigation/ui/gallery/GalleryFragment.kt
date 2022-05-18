package com.example.learningnavigation.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.learningnavigation.databinding.FragmentGalleryBinding
import com.example.learningnavigation.ui.InstructionFragment

class GalleryFragment : Fragment() {


    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        textView.text = "This is the Gallery Fragment"

        // to receive information from a bundle, use the built in variable
        // arguments

        val message = arguments?.getString(InstructionFragment.BUNDLE_GALLERY_INFO) ?: ""
        textView.text = "This is the Gallery Fragment\n$message"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}