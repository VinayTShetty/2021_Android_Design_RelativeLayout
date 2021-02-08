package com.relativelayout.example.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.relativelayout.example.Fragment.FragmentDefaultPosition;
import com.relativelayout.example.Fragment.Fragment_layout_above;
import com.relativelayout.example.Fragment.Fragment_layout_alignBaseline;
import com.relativelayout.example.Fragment.Fragment_layout_alignEnd;
import com.relativelayout.example.Fragment.Fragment_layout_alignLeft;
import com.relativelayout.example.Fragment.Fragment_layout_align_ParentBottom;
import com.relativelayout.example.Fragment.Fragment_layout_alignbottom;


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
                return  new Fragment_layout_alignbottom();
            case 4:
                return  new Fragment_layout_alignEnd();
            case 5:
                return  new Fragment_layout_alignLeft();
            case 6:
                return  new Fragment_layout_align_ParentBottom();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
