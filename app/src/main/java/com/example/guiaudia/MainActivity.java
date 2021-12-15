package com.example.guiaudia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.guiaudia.adapter.AttractionsPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.vpv_main);

        AttractionsPageAdapter adapter = new AttractionsPageAdapter(getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tlv_main_tab);
        tabLayout.setupWithViewPager(viewPager);

    }
}