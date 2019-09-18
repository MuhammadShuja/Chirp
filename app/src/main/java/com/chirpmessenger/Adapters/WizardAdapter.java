package com.chirpmessenger.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chirpmessenger.Fragments.WizardFragment;

/**
 * Created by Administrator on 2/14/2018.
 */

public class WizardAdapter extends FragmentPagerAdapter {

    private int WIZARD_PAGES_COUNT = 3;

    public WizardAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return WizardFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return WIZARD_PAGES_COUNT;
    }
}
