package com.example.carapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.carapp.R
import com.example.carapp.databinding.ActivityMainBinding
import com.example.carapp.viewModels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val binding = ActivityMainBinding.inflate(layoutInflater) //= DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.lifecycleOwner = this
//        val mainViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
//
//        button1.setOnClickListener {
//            Toast.makeText(this, "Button1 was pressed", Toast.LENGTH_SHORT)
//            mainViewModel.onButtonOnePressed()
//        }
//
//        button2.setOnClickListener {
//            Toast.makeText(this, "Button2 was pressed", Toast.LENGTH_SHORT)
//            mainViewModel.onButtonTwoWasPressed()
//        }
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.action_bar, menu)
//        return true
    }
}