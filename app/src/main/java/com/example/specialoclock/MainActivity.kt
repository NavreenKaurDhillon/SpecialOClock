package com.example.specialoclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set navigation controller
        val nestedNavHostFragment = supportFragmentManager.findFragmentById(R.id.main_fragment) as? NavHostFragment
        navController = nestedNavHostFragment?.navController!!

        if (navController != null) {
            navController.addOnDestinationChangedListener { _, destination, _ ->
                when (destination.id) {
//                    R.id.splashFragment -> hideBothNav()
//                    R.id.planTripsScreenFragment -> hideBothNav()
//                    R.id.loginFragment -> hideBothNav()
//                    R.id.registerFragment -> hideBothNav()
//                    R.id.flights -> showBothNav()
//                    R.id.experience -> showBothNav()
//                    R.id.eVisa -> showBothNav()
//                    R.id.travelEssentials -> showBothNav()
//                    R.id.eSims -> showBothNav()
//
//                    else -> {
//                        showBothNav()
//                        lockDrawer()
//                    }
                }
            }
        }
//        setBottomNavigation(mainBinding , navController)
    }

    private fun setBottomNavigation(mainBinding: Any, navController: NavController) {
//        mainBinding.flightsLayout.setOnClickListener(this )
//        mainBinding.eSimLayout.setOnClickListener(this)
//        mainBinding.eVisaLayout.setOnClickListener(this)
//        mainBinding.experiencesLayout.setOnClickListener(this)
//        mainBinding.travelEssentialsLayout.setOnClickListener(this)
    }

    private fun setNavDrawerController() {

    }
}