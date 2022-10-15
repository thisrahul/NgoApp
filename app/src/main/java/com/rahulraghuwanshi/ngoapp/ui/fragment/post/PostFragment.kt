package com.rahulraghuwanshi.ngoapp.ui.fragment.post

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.rahulraghuwanshi.ngoapp.R
import com.rahulraghuwanshi.ngoapp.data.Response
import com.rahulraghuwanshi.ngoapp.databinding.FragmentPostBinding
import com.rahulraghuwanshi.ngoapp.databinding.FragmentSignUpBinding


class PostFragment : Fragment() {

    private val TAG = "POSTFRAGMENT"

    private var _binding: FragmentPostBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: PostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPostBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(PostViewModel::class.java)
        //actions are here

    }

    private fun getPost(response: Response) {
        response.post?.let { post ->
            post.forEach { item ->
                item.title?.let {
                    Toast.makeText(context,"Success!!",Toast.LENGTH_SHORT).show()
                }
            }
        }

        response.exception?.let { exception ->
            exception.message?.let {
                Toast.makeText(context,"Something is wrong!!",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun post(response: Response) {
        response.post?.let { post ->
            post.forEach { item ->
                item.title?.let {
                    Toast.makeText(context,"Success!!",Toast.LENGTH_SHORT).show()
                }
            }
        }

        response.exception?.let { exception ->
            exception.message?.let {
                Toast.makeText(context,"Something is wrong!!",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}