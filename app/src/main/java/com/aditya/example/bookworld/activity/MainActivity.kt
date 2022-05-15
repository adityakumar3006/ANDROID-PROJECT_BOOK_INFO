package com.aditya.example.bookworld.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.aditya.example.bookworld.*
import com.aditya.example.bookworld.fragment.AboutFragment
import com.aditya.example.bookworld.fragment.DashboardFragment
import com.aditya.example.bookworld.fragment.FavouritesFragment
import com.aditya.example.bookworld.fragment.ProfileFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    var previousmenuitem:MenuItem?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerlayout)
        coordinatorLayout = findViewById(R.id.coordinatorlayout)
        toolbar = findViewById(R.id.toolbarlayout)
        frameLayout = findViewById(R.id.framelayout)
        navigationView = findViewById(R.id.navigationview)
        setuptoolbar()
        opendashboard()


        val actionBardrawertoggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )
        drawerLayout.addDrawerListener(actionBardrawertoggle) // making the handburger icon functional
        actionBardrawertoggle.syncState()// chane the icon to backarrow and viceversa
        navigationView.setNavigationItemSelectedListener{

       /*     if (previousmenuitem!=null) {
                previousmenuitem?.isChecked = false
            }
            it.isCheckable=true
            it.isChecked=true
        previousmenuitem=it// current to previous menu item
         */

            if (previousmenuitem!=null) {
                previousmenuitem?.isChecked = false
            }
            it.isCheckable=true
            it.isChecked=true
            previousmenuitem=it// current to previous menu item
            when (it.itemId) {
                R.id.dashboard -> {
              opendashboard()

                    drawerLayout.closeDrawers()

                }
                R.id.favourites ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, FavouritesFragment())


                        .commit()
                    supportActionBar?.title="FAVOURITES"
                    drawerLayout.closeDrawers()
                }
                R.id.profile ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, ProfileFragment())

                        .commit()
                    supportActionBar?.title="PROFILE"
                    drawerLayout.closeDrawers()


                }
                R.id.about ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.framelayout, AboutFragment())
                        .addToBackStack("About")
                        .commit()
                    supportActionBar?.title="ABOUT"
                    drawerLayout.closeDrawers()



                }
            }

            return@setNavigationItemSelectedListener true
        }
    }
    fun setuptoolbar()
    {
        setSupportActionBar(toolbar)
        supportActionBar?.title = "toolbar title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        if(id==android.R.id.home)
        {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }
    fun opendashboard() {
        val transaction= supportFragmentManager.beginTransaction()
        val fragment= DashboardFragment()
            transaction.replace(R.id.framelayout, DashboardFragment())


            transaction.commit()
        supportActionBar?.title = "DASHBOARD"
        navigationView.setCheckedItem(R.id.dashboard)


    }


    override fun onBackPressed() {
        val frag=supportFragmentManager.findFragmentById(R.id.framelayout)
        when(frag)
        {
            !is DashboardFragment -> opendashboard()
            else->super.onBackPressed()
        }
    }

    }
