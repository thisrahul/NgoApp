package com.rahulraghuwanshi.ngoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahulraghuwanshi.ngoapp.R
import com.rahulraghuwanshi.ngoapp.databinding.FragmentPostBinding
import com.rahulraghuwanshi.ngoapp.databinding.FragmentSignUpBinding


class PostFragment : Fragment() {

    private var _binding: FragmentPostBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPostBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //actions are here
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}