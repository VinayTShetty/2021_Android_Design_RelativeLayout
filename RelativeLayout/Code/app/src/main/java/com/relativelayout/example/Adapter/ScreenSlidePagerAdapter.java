package com.relativelayout.example.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.relativelayout.example.Fragment.FragmentDefaultPosition;
import com.relativelayout.example.Fragment.Fragment_layout_ParentEnd;
import com.relativelayout.example.Fragment.Fragment_layout_above;
import com.relativelayout.example.Fragment.Fragment_layout_alignBaseline;
import com.relativelayout.example.Fragment.Fragment_layout_alignEnd;
import com.relativelayout.example.Fragment.Fragment_layout_alignLeft;
import com.relativelayout.example.Fragment.Fragment_layout_alignParentLeft;
import com.relativelayout.example.Fragment.Fragment_layout_alignParentRight;
import com.relativelayout.example.Fragment.Fragment_layout_alignParentTop;
import com.relativelayout.example.Fragment.Fragment_layout_alignParentstart;
import com.relativelayout.example.Fragment.Fragment_layout_alignWithParentIfMissing;
import com.relativelayout.example.Fragment.Fragment_layout_align_ParentBottom;
import com.relativelayout.example.Fragment.Fragment_layout_align_Right;
import com.relativelayout.example.Fragment.Fragment_layout_align_Start;
import com.relativelayout.example.Fragment.Fragment_layout_align_Top;
import com.relativelayout.example.Fragment.Fragment_layout_alignbottom;
import com.relativelayout.example.Fragment.Fragment_layout_below;
import com.relativelayout.example.Fragment.Fragment_layout_centerHorizontal;
import com.relativelayout.example.Fragment.Fragment_layout_centerInParent;
import com.relativelayout.example.Fragment.Fragment_layout_centerVertical;
import com.relativelayout.example.Fragment.Fragment_layout_toRightof;
import com.relativelayout.example.Fragment.Fragment_layout_toStartof;
import com.relativelayout.example.Fragment.Fragment_layout_toleftof;


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
            case 7:
                return  new Fragment_layout_ParentEnd();
            case 8:
                return  new Fragment_layout_alignParentLeft();
            case 9:
                return  new Fragment_layout_alignParentRight();
            case 10:
                return  new Fragment_layout_alignParentstart();
            case 11:
                return  new Fragment_layout_alignParentTop();
            case 12:
                return  new Fragment_layout_align_Right();
            case 13:
                return  new Fragment_layout_align_Start();
            case 14:
                return  new Fragment_layout_align_Top();
            case 15:
                return  new Fragment_layout_alignWithParentIfMissing();
            case 16:
                return  new Fragment_layout_below();
            case 17:
                return  new Fragment_layout_centerHorizontal();
            case 18:
                return  new Fragment_layout_centerVertical();
            case 19:
                return  new Fragment_layout_toleftof();
            case 20:
                return  new Fragment_layout_toRightof();
            case 21:
                return  new Fragment_layout_toStartof();
            case 22:
                return  new Fragment_layout_centerInParent();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 23;
    }
}
