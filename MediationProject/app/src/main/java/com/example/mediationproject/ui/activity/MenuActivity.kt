package com.example.mediationproject.ui.activity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mediationproject.R
import com.example.mediationproject.databinding.ActivityMenuBinding
import com.example.mediationproject.ui.fragment.home.HomeFragment

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_menu)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)

        //извлекаем данные из Intent
        val massage = intent.getStringExtra("key") ?: ""

        //польскольку во фрагмент нельзя передать данные напрямую (как в активностях),
        //поэтому передаем данные в HomeFragment через аргументы
        val homeFragment = HomeFragment.newInstance(massage)


        //добавляемHomeFragment в NavController
        navController.navigate(R.id.navigation_home, null, null, null)

        //устанавливаем HomeFragment как текущий фрагмент
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_activity_menu, homeFragment)
            .commit()

        navView.setupWithNavController(navController)
    }
}