package com.example.specialoclock.ui.fragments.bottomnavscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.specialoclock.ui.adapters.LocationsAdapter

class HomeFragment : Fragment() {
    var locationsAdapter = LocationsAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        private fun initialiseLocationsData() {
//            val locations = ArrayList<LocationsModelClass>()
//            locations.add(LocationsModelClass("spot 1"))
//            bindings.locationsRV.adapter = locationsAdapter
//            locationsAdapter.submitList(locations)
//        }

    }
}