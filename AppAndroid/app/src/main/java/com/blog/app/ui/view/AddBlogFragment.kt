package com.blog.app.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.blog.app.databinding.FragmentAddBlogBinding
import com.blog.app.domain.model.Blog
import com.blog.app.ui.viewmodel.BlogViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@AndroidEntryPoint
class AddBlogFragment : Fragment() {

    private var _binding: FragmentAddBlogBinding? = null
    private val binding get() = _binding!!
    private val blogViewModel: BlogViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAddBlogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGuardar.setOnClickListener {

            if(validaciones())
                lifecycleScope.launch(Dispatchers.IO) {
                    blogViewModel.insertBlog(
                        Blog(
                            0,
                            binding.edTitulo!!.text.toString(),
                            binding.edAutor!!.text.toString(),
                            "",
                            binding.edTitulo!!.text.toString(),

                            )
                    )
                }

        }

        blogViewModel.isSave.observe(viewLifecycleOwner, Observer {
            if (it)
            {
                Toast.makeText(context,"EL Blog se Guardo Correctamente",Toast.LENGTH_SHORT).show()
                findNavController().navigate(AddBlogFragmentDirections.actionAddBlogFragmentToHomeFragment())
            }
            else
                Toast.makeText(context,"Error al Guardar Blog",Toast.LENGTH_SHORT).show()
        })

        blogViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            binding.progress.isVisible = it;
        })
    }


    fun validaciones(): Boolean {

        val titulo = binding.edTitulo!!.text.toString()
        val autor = binding.edAutor!!.text.toString()
        val contenido = binding.edContenido!!.text.toString()

        if (titulo.isEmpty())
            binding.inputTitulo.error = "Campo Requerido"
        else
            binding.inputTitulo.error = null

        if (autor.isEmpty())
            binding.inputAutor.error = "Campo Requerido"
        else
            binding.inputAutor.error = null

        if (contenido.isEmpty())
            binding.inputContenido.error = "Campo Requerido"
        else
            binding.inputContenido.error = null

        return titulo.isNotEmpty() && autor.isNotEmpty() && contenido.isNotEmpty()
    }


}