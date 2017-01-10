package me.morshadunnur.tabviewswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by codemagic on 1/10/17.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TopratedFragment();
            case 1:
                return new NewFragment();
            case 2:
                return new OldFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}