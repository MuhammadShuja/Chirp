package com.chirpmessenger.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.chirpmessenger.Fragments.InboxPagerFragment;

/**
 * Created by Administrator on 2/15/2018.
 */

public class InboxAdapter extends FragmentStatePagerAdapter {

    private int PAGE_COUNT = 2;

    public InboxAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return InboxPagerFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position){
//            case 0:
//                return "Inbox";
//            case 1:
//                return "Groups";
//            default:
//                return super.getPageTitle(position);
//        }
//    }
}
