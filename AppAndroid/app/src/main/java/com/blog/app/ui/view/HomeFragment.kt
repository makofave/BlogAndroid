package com.blog.app.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.blog.app.data.model.BlogAdapter
import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.BlogProvider
import com.blog.app.databinding.FragmentHomeBinding
import com.blog.app.ui.viewmodel.BlogViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: BlogAdapter

    private val blogViewModel:BlogViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.floatBtnAdd.setOnClickListener{
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAddBlogFragment())
        }

        initREcyclerView()

    }

    private fun initREcyclerView() {
        val manager = LinearLayoutManager(context)
        blogViewModel.blogList.observe(viewLifecycleOwner, Observer {
            adapter=BlogAdapter(it)
            binding.rvBlog.layoutManager=manager
            binding.rvBlog.adapter=adapter
        })
        lifecycleScope.launch(Dispatchers.IO) {
            blogViewModel.getAllBlog()
        }


    }
}