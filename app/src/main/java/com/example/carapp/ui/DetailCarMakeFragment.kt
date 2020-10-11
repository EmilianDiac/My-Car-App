package com.example.carapp.ui

import ASTON_MARTIN
import BMW
import BUELL
import BUGATTI
import JAGUAR
import LAND_ROVER
import MASERATI
import MERCEDES
import MINI
import ROLLS_ROYCE
import TESLA
import TOYOTA
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
        binding.imageView.setImageResource(when (carMakeId){
            ASTON_MARTIN -> R.drawable.aston_martin
            TESLA -> R.drawable.tesla
            MASERATI -> R.drawable.maserati
            LAND_ROVER -> R.drawable.land_rover
            ROLLS_ROYCE -> R.drawable.rolls_royce
            BUELL -> R.drawable.buell
            TOYOTA -> R.drawable.toyota
            MERCEDES -> R.drawable.mercedes
            JAGUAR -> R.drawable.jaguar
            BMW -> R.drawable.bmw
            BUGATTI -> R.drawable.bugatti
            MINI -> R.drawable.mini_cooper
            else -> R.drawable.car_make_not_found
        })
        super.onViewCreated(view, savedInstanceState)
    }
}