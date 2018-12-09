package michaeltm98.com.devportfolio.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import michaeltm98.com.devportfolio.views.AboutFragment;
import michaeltm98.com.devportfolio.views.ContactFragment;
import michaeltm98.com.devportfolio.views.SkillsFragment;
import michaeltm98.com.devportfolio.views.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return null;
    }
}
