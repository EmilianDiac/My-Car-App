package com.example.carapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.carapp.R
import com.example.carapp.databinding.FragmentCarsBinding
import com.example.carapp.network.CarMake
import com.example.carapp.recyclerView.CarMakeAdapter
import com.example.carapp.viewModels.CarsFragmentViewModel

interface DetailClickListener {
    fun detailClickListener(car: CarMake)
}
class CarsFragment : Fragment(), DetailClickListener {



    private var fragmentCarsBinding: FragmentCarsBinding? = null

    private val carsFragmentViewModel: CarsFragmentViewModel by lazy {
        ViewModelProvider(this).get(CarsFragmentViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_cars, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentCarsBinding = FragmentCarsBinding.bind(view)
        fragmentCarsBinding!!.carsFragmentViewModel = carsFragmentViewModel

        val adapter =
            CarMakeAdapter(this as DetailClickListener)
        fragmentCarsBinding!!.makesRecyclerView.adapter = adapter

        carsFragmentViewModel.carMakeList.observe(viewLifecycleOwner, Observer {
            adapter.data = it
            Log.d("CAR INFO", it.toString())
        })

    }

    override fun onDestroy() {
        fragmentCarsBinding = null
        super.onDestroy()
    }

    override fun detailClickListener(car : CarMake) {
        val action = CarsFragmentDirections.actionCarsFragmentToDetailCarMakeFragment(car.makeId)
        this.findNavController().navigate(action)
    }

}