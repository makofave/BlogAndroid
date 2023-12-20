package com.blog.app.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blog.app.databinding.FragmentAddBlogBinding

class AddBlogFragment : Fragment() {

    private var _binding: FragmentAddBlogBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding=FragmentAddBlogBinding.inflate(inflater,container,false)
        return binding.root
    }

}