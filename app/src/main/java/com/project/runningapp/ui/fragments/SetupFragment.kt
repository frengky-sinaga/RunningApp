package com.project.runningapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.project.runningapp.R
import com.project.runningapp.databinding.FragmentSetupBinding

class SetupFragment: Fragment(R.layout.fragment_setup) {

    private lateinit var binding: FragmentSetupBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSetupBinding.bind(view)
    }
}