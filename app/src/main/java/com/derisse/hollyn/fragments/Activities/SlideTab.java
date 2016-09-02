package com.derisse.hollyn.fragments.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.derisse.hollyn.fragments.Fragments.FragmentPagerA;
import com.derisse.hollyn.fragments.Fragments.FragmentPagerB;
import com.derisse.hollyn.fragments.Fragments.FragmentPagerC;
import com.derisse.hollyn.fragments.R;

public class SlideTab extends FragmentActivity {

    ViewPager viewPager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_tab);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentManager manager = getSupportFragmentManager();
        viewPager.setAdapter(new MyPagerAdapter(manager));
    }

}

class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new FragmentPagerA();
        else if (position == 1)
            fragment = new FragmentPagerB();
        else if (position == 2)
            fragment = new FragmentPagerC();
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Page A";
        else if (position == 1)
            return "Page B";
        else if (position == 2)
            return "Page C";
        return "";
    }
}
