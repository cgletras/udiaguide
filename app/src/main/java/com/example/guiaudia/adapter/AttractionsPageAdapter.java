package com.example.guiaudia.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.guiaudia.R;
import com.example.guiaudia.fragments.CinemaFragment;
import com.example.guiaudia.fragments.MuseumsFragment;
import com.example.guiaudia.fragments.NatureFragment;
import com.example.guiaudia.fragments.ParksSquaresGardensFragment;

public class AttractionsPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public AttractionsPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public AttractionsPageAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.nature);
        } else if (position == 1) {
            return mContext.getString(R.string.museum);
        } else if (position == 2) {
            return mContext.getString(R.string.cinemas);
        } else {
            return mContext.getString(R.string.parks);
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new NatureFragment();
        } else if (position == 1){
            return new MuseumsFragment();
        } else if (position ==2){
            return new CinemaFragment();
        } else {
            return new ParksSquaresGardensFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
