package com.example.busfleets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this,drawerLayout,toolbar,0,0
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem):Boolean {
        when (item.itemId) {
            R.id.nav_prodazha -> {
                Toast.makeText(this, "Продажа билетов", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_admin -> {
                Toast.makeText(this, "Админ", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_bus -> {
                Toast.makeText(this, "Автобусы", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_statistics -> {
                Toast.makeText(this, "Статистика", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_passengers -> {
                Toast.makeText(this, "Пассажиры", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_schedule -> {
                Toast.makeText(this, "Расписание", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_history -> {
                Toast.makeText(this, "История", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_settings -> {
                Toast.makeText(this, "Настроики", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}