package com.example.mediationproject.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mediationproject.data.model.Feel
import com.example.mediationproject.data.repository.FeelRepository
import com.example.mediationproject.data.repository.StateRepository
import com.example.mediationproject.databinding.FragmentHomeBinding
import com.example.mediationproject.ui.adapter.FeelAdapter
import com.example.mediationproject.ui.adapter.StateAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // получение данных их intent, с проверкой возможности отсутствия аргументов.
        val massage = arguments?.getString("key") ?: ""

        val textView: TextView = binding.welcomBackText
        textView.text = "С возвращением, $massage !"

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        val feelRecycler: RecyclerView = binding.feelRec
        feelRecycler.adapter = FeelAdapter(FeelRepository().list)
        feelRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val stateRecycler: RecyclerView = binding.stateRec
        stateRecycler.adapter = StateAdapter(StateRepository().state_list)
        stateRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    companion object{
        fun  newInstance(key: String): HomeFragment{
            val fragment = HomeFragment()
            val args = Bundle()
            args.putString("key", key)
            fragment.arguments = args
            return  fragment
        }
    }
}