package com.apap.hcc

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity: FullscreenActivity() {

    private val homeFragment = supportFragmentManager.findFragmentById(R.id.home_fragment) as NavHostFragment
    private val navController = homeFragment.navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBottomNavigation()
        setupListeners()
    }

    private fun setupBottomNavigation() {
        findViewById<BottomNavigationView>(R.id.home_bottom_navigation)
            .setupWithNavController(navController)
    }

    private fun setupListeners() {

    }
}