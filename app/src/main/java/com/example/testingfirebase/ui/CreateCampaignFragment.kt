package com.example.testingfirebase.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testingfirebase.databinding.FragmentCreateCampaignBinding
import com.example.testingfirebase.databinding.FragmentProfileBinding

class CreateCampaignFragment : Fragment() {

    private lateinit var binding: FragmentCreateCampaignBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateCampaignBinding.inflate(inflater, container, false)
        initViews()
        return binding.root
    }

    private fun initViews() {

    }

}