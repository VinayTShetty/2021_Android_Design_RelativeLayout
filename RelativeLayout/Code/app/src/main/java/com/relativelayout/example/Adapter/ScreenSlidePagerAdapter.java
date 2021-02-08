package com.relativelayout.example.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.relativelayout.example.Fragment.FragmentDefaultPosition;
import com.relativelayout.example.Fragment.Fragment_layout_above;
import com.relativelayout.example.Fragment.Fragment_layout_alignBaseline;


public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    public ScreenSlidePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new FragmentDefaultPosition();
            case 1:
                return  new Fragment_layout_above();
            case 2:
                return  new Fragment_layout_alignBaseline();
            case 3:
                return  new FragmentDefaultPosition();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
