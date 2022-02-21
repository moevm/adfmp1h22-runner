package com.example.runner.ui.run

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.runner.databinding.FragmentRunBinding

class RunFragment : Fragment() {

    private var _binding: FragmentRunBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val runViewModel =
                ViewModelProvider(this).get(RunViewModel::class.java)

        _binding = FragmentRunBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRun
        runViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}