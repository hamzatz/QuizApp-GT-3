package com.geektech.quizapp_gt_3.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.geektech.quizapp_gt_3.history.HistoryFragment;
import com.geektech.quizapp_gt_3.settings.SettingsFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);


    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position != 1) {
            if (position != 2) {
                return MainFragment.newInstance();
            }
            return SettingsFragment.newInstance();
        }
        return HistoryFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
