package com.example.vpnpj5.ui.fragments.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.vpnpj5.R
import com.example.vpnpj5.databinding.SettingScreenBinding

class SettingFragment : Fragment() {
    private lateinit var settingScreenBinding: SettingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        settingScreenBinding = SettingScreenBinding.inflate(inflater, container, false)

        settingScreenBinding.constraintLayoutKillSwitch.setOnClickListener {
            findNavController().navigate(R.id.action_settingFragment_to_myAccountFragment2)
        }



        return settingScreenBinding.root
    }


    private fun navigateMyAccount() {
    }
}