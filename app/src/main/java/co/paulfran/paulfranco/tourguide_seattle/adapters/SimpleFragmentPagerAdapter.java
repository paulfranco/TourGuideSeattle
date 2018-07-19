package co.paulfran.paulfranco.tourguide_seattle.adapters;

import android.content.Context;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import co.paulfran.paulfranco.tourguide_seattle.R;
import co.paulfran.paulfranco.tourguide_seattle.fragments.AttractionsFragment;
import co.paulfran.paulfranco.tourguide_seattle.fragments.LandmarksFragment;
import co.paulfran.paulfranco.tourguide_seattle.fragments.ParksFragment;
import co.paulfran.paulfranco.tourguide_seattle.fragments.RestaurantsFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_landmarks);
        } else if (position == 1) {
            return context.getString(R.string.category_attractions);
        } else if (position == 2) {
            return context.getString(R.string.category_restaurants);
        } else {
            return context.getString(R.string.category_parks);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else if (position == 1) {
            return new AttractionsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ParksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
