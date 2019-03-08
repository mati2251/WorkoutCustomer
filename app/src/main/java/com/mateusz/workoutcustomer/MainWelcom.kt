package com.mateusz.workoutcustomer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

/**
 * MainActivity is splash screen
 *
 * It show only on 0.7 seconds layout activity_welcom and switch to MenuActivity
 * @author Mateusz Karłowski
 */


class MainActivity :  AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)
        Handler().postDelayed({
            val homeIntent = Intent(this@MainActivity, MenuActivity::class.java)
            startActivity(homeIntent)
            finish()
        }, 700)
    }
}
