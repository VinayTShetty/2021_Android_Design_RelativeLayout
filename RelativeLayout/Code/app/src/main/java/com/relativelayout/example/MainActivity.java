package com.relativelayout.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.relativelayout.example.Adapter.ScreenSlidePagerAdapter;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private ScreenSlidePagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager=(ViewPager)findViewById(R.id.main_activity_view_pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager(),BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mPager.setAdapter(pagerAdapter);
    }
}