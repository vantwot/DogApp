package com.example.project1.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.project1.R
import com.example.project1.databinding.FragmentEditAppointmentBinding
import com.example.project1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    //private  var _binding: FragmentHomeBinding? = null

    //private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

}

