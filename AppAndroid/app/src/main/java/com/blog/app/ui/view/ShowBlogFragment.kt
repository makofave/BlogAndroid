package com.blog.app.ui.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.blog.app.R
import com.blog.app.databinding.FragmentHomeBinding
import com.blog.app.databinding.FragmentShowBlogBinding
import com.blog.app.domain.model.Blog
import com.blog.app.ui.viewmodel.BlogViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ShowBlogFragment : Fragment() {
    val args: ShowBlogFragmentArgs by navArgs()
    private var _binding: FragmentShowBlogBinding? = null
    private val binding get() = _binding!!
    private val blogViewModel: BlogViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentShowBlogBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        blogViewModel.blog.postValue(Blog(id=-1, titulo = "", autor = "", fecha = "",contenido=""))

        initBlog()
        Log.i("prueba-d",args.idblog)

        blogViewModel.blog.observe(viewLifecycleOwner, Observer { blog ->
            binding.tvTitulo.text = blog.titulo
            binding.tvAutor.text = blog.autor
            binding.tvFecha.text = blog.fecha
            binding.tvConenido.text = blog.contenido
        })
    }

    private fun initBlog() {
        lifecycleScope.launch(Dispatchers.IO) {
            blogViewModel.getBlog(args.idblog)
        }

    }


}