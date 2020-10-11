package com.example.carapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.carapp.R
import com.example.carapp.databinding.FragmentDetailCarMakeBinding


class DetailCarMakeFragment : Fragment() {

    val args: DetailCarMakeFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_car_make, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentDetailCarMakeBinding.bind(view)
        val carMakeId = args.CarMakeId
        binding.carMakeId.text = carMakeId.toString()
        super.onViewCreated(view, savedInstanceState)
    }
}