package com.example.delivery.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.delivery.R
import com.example.delivery.databinding.FragmentCallingBinding
import com.example.delivery.databinding.FragmentChatBinding

class CallingFragment : Fragment() {
    private var _binding : FragmentCallingBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentCallingBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()


        binding.fcallBtnPutCall.setOnClickListener {
            controller.popBackStack()
        }
    }
}