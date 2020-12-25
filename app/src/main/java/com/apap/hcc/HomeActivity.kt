package com.apap.hcc

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.apap.hcc.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity: FullscreenActivity() {

    private lateinit var binding: ActivityHomeBinding

    private val homeFragment = supportFragmentManager.findFragmentById(R.id.home_fragment) as NavHostFragment
    private val navController = homeFragment.navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupBottomNavigation()
        setupListeners()
    }

    private fun setupBinding() {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_home)
    }

    private fun setupBottomNavigation() {
        findViewById<BottomNavigationView>(R.id.home_bottom_navigation)
            .setupWithNavController(navController)
    }

    private fun setupListeners() {
        with(binding) {
            homeBottomNavigation.setOnNavigationItemSelectedListener {

                when (it.itemId) {
                    R.id.home_fragment -> showTitle(getString(R.string.home_nav_text))
                    R.id.calendar_fragment -> showTitle(getString(R.string.calendar_nav_text))
                    R.id.notes_fragment -> showTitle(getString(R.string.notes_nav_text))
                }
                true
            }
        }
    }

    private fun showTitle(title: String) {
        binding.title.text = title
    }
}