package com.example.todolist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation =findViewById(R.id.bottombar);
        getSupportFragmentManager().beginTransaction().replace(R.id.containercnh, new home()).commit();
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()){
                    case R.id.nav_home:
                        selectedFragment = new home();
                        break;
                    case R.id.nav_date:
                        selectedFragment = new tugas();
                            break;
                    case R.id.nav_setting:
                        selectedFragment = new setting();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.containercnh, selectedFragment).commit();
                return true;
            }
        });
    }
}