package com.androidwebinar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class Test :AppCompatActivity() {


    /*lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main);
        binding.textGreetings.setText("Data Binding")
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java);
        binding.viewModel=viewModel
    }*/
}