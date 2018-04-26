package com.fragmentdemo.varunam.tabbedlayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numberOfTabs = NumOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentOne fragmentOne = new FragmentOne();
                return fragmentOne;
            case 1:
                FragmentTwo fragmentTwo = new FragmentTwo();
                return fragmentTwo;
            case 2:
                FragmentThree fragmentThree = new FragmentThree();
                return fragmentThree;
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
