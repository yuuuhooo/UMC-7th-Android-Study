package com.example.second_week_mission

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        replaceFragment(HomeFragment())

        // 아이템 선택 이벤트 리스너 설정
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragment_home -> {
                    // Home 아이템이 선택되었을 때
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.fragment_pencil -> {
                    // Search 아이템이 선택되었을 때
                    replaceFragment(PencilFragment())
                    true
                }
                R.id.fragment_calendar -> {
                    // Profile 아이템이 선택되었을 때
                    replaceFragment(CalendarFragment())
                    true
                }
                R.id.fragment_user -> {
                    // Profile 아이템이 선택되었을 때
                    replaceFragment(UserFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_container, fragment)
        fragmentTransaction.setCustomAnimations(R.anim.from_left, R.anim.to_right, R.anim.from_right, R.anim.to_left);
        fragmentTransaction.commit()
    }


}

