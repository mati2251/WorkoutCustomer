package com.mateusz.workoutcustomer

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.FragmentActivity
import android.support.v4.app.Fragment
import android.view.MenuItem

/**
 * A class MenuActivity is Main Activity in my App
 *
 * @author Mateusz Karłowski
 */


class MenuActivity : FragmentActivity() , BottomNavigationView.OnNavigationItemSelectedListener{

    /**
     * Function onNavigationItemSelected change fragments when user chosen option on BottomNavigationView
     */

    lateinit var fab : FloatingActionButton

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment : Fragment
        when (item.itemId) {
            R.id.navigation_home -> {
                fragment = HomeFragment()
                fab.show()
            }
            R.id.navigation_history -> {
                fragment = CalendarFragment()
                fab.hide()
            }
            R.id.navigation_notifications -> {
                fragment = NotifyFragment()
                fab.hide()
            }
            R.id.navigation_settings ->{
                fragment = SettingsFragment()
                fab.hide()
            }
            else ->{
                fab.show()
                fragment = HomeFragment()
            }
        }
        return loadFragment(fragment)
    }

    /**
     * Function onCreate evokes when class MenuActivity are creates.
     * It set layout activity_menu
     * It evokes function loadFragment because set default fragment
     * Next create variable navigation and changes it into BottomNavigationView from layout
     * The last set listener for BottomNavigationView
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        loadFragment(HomeFragment())
        fab = findViewById(R.id.floatingActionButton)
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(this)
    }

    /**
     * Function loadFragment start new Fragment in the part of the Layout
     */

    fun loadFragment(fragment: Fragment?): Boolean {
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
