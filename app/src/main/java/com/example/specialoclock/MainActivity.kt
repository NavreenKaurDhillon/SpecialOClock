package com.example.specialoclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.NetworkOnMainThreadException
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.specialoclock.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        //set navigation controller
        val nestedNavHostFragment = supportFragmentManager.findFragmentById(R.id.main_fragment) as? NavHostFragment
        navController = nestedNavHostFragment?.navController!!

        navController.navigate(R.id.splashFragment)

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

    private fun setBottomNavigation(mainBinding: ActivityMainBinding) {
//        mainBinding.flightsLayout.setOnClickListener(this )
//        mainBinding.eSimLayout.setOnClickListener(this)
//        mainBinding.eVisaLayout.setOnClickListener(this)
//        mainBinding.experiencesLayout.setOnClickListener(this)
//        mainBinding.travelEssentialsLayout.setOnClickListener(this)
    }

    private fun setNavDrawerController() {

    }
}