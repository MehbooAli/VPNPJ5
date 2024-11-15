package com.example.vpnpj5.ui.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vpnpj5.R
import com.example.vpnpj5.ui.adapters.ServerListAdopter
import com.example.vpnpj5.data.model.ServerListItemModel
import com.example.vpnpj5.databinding.HomeScreenBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class HomeFragment : Fragment() {
    private lateinit var homeScreenBinding: HomeScreenBinding



    val serverListData = listOf<ServerListItemModel>(
        ServerListItemModel(R.drawable.usflage, "Hello 1"),
        ServerListItemModel(R.drawable.usflage, "Hello 2"),
        ServerListItemModel(R.drawable.usflage, "Hello 3"),
        ServerListItemModel(R.drawable.usflage, "Hello 4"),
        ServerListItemModel(R.drawable.usflage, "Hello 5"),
        ServerListItemModel(R.drawable.usflage, "Hello 6"),
        ServerListItemModel(R.drawable.usflage, "Hello 7"),

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeScreenBinding = HomeScreenBinding.inflate(inflater, container, false)
        BottomSheetBehavior.from(homeScreenBinding.standardBottomSheet).apply {
            peekHeight = 260
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
        val recyclerView = homeScreenBinding.recyclerviewOfServers
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ServerListAdopter(serverListData)


        return homeScreenBinding.root
    }

}