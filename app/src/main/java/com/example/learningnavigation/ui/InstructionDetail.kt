package com.example.learningnavigation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learningnavigation.databinding.FragmentInstructionsDetailBinding
import com.example.learningnavigation.ui.Instructions

class InstructionDetail : AppCompatActivity() {

    private lateinit var binding: FragmentInstructionsDetailBinding

    companion object {
        val EXTRA_INSTRUCTION = "The instruction"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentInstructionsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val instructions = intent.getParcelableExtra<Instructions>(EXTRA_INSTRUCTION)
        binding.textViewInstructionsDetailName.text = instructions?.name
        binding.textViewInstructionsDetailDescription.text = instructions?.instructions

    }
}