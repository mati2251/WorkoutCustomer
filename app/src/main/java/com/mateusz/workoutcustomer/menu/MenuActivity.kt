package com.mateusz.workoutcustomer.menu

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.mateusz.workoutcustomer.R
import com.mateusz.workoutcustomer.creator.SetTitleActivity

/**
 * A class MenuActivity is Main Activity in my App
 * @author Mateusz Karłowski
 */


class MenuActivity : AppCompatActivity() , BottomNavigationView.OnNavigationItemSelectedListener{

    /**
     * Function onNavigationItemSelected change fragments when user chosen option on BottomNavigationView
     */

    lateinit var fab : FloatingActionButton
    private val newWorkoutActivityRequestCode = 1
    lateinit var fragment : Fragment

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_home -> {
                fragment = HomeFragment()
                fab.show()
            }
            R.id.navigation_history -> {
                fragment = CalendarFragment()
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
        fragment = HomeFragment()
        loadFragment(fragment)
        fab = findViewById(R.id.floatingActionButton)
        fab.setOnClickListener {
            if (fragment is HomeFragment){
                var creatorIntent : Intent = Intent(this, SetTitleActivity::class.java)
                startActivityForResult(creatorIntent, newWorkoutActivityRequestCode)
            }
        }
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(this)
        supportActionBar?.hide()
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
