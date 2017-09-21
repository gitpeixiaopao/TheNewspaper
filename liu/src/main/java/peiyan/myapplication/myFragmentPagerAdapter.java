package peiyan.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;



public class myFragmentPagerAdapter extends FragmentPagerAdapter {


    public myFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    private List<Fragment> list;

    public void setFragment( List<Fragment> fragments){
        list=fragments;

    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}