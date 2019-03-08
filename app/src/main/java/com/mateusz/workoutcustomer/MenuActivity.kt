package com.mateusz.workoutcustomer

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentActivity
import android.support.v4.app.Fragment
import android.view.MenuItem


class MenuActivity : FragmentActivity() , BottomNavigationView.OnNavigationItemSelectedListener{
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment : Fragment
        when (item.itemId) {
            R.id.navigation_home -> {
                fragment = HomeFragment()
            }
            R.id.navigation_calendary -> {
                fragment = CalendarFragment()
            }
            R.id.navigation_notifications -> {
                fragment = NotifyFragment()
            }
            R.id.navigation_settings ->{
                fragment = SettingsFragment()
            }
            else ->{
                fragment = HomeFragment()
            }
        }
        return loadFragment(fragment)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        loadFragment(HomeFragment())
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(this)
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
            return true
        }
        return false
    }

}
