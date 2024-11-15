package com.example.vpnpj5.ui.fragments.myAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vpnpj5.databinding.MyAccountScreenBinding

class MyAccountFragment : Fragment() {
    private lateinit var myAccountScreenBinding: MyAccountScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        myAccountScreenBinding = MyAccountScreenBinding.inflate(inflater, container, false)

        return myAccountScreenBinding.root
    }

}