package co.paulfran.paulfranco.tourguide_seattle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import co.paulfran.paulfranco.tourguide_seattle.app.Location;
import co.paulfran.paulfranco.tourguide_seattle.adapters.LocationAdapter;
import co.paulfran.paulfranco.tourguide_seattle.R;

public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        Log.i("Fragment Check ", "Landmark Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.space_needle_title), R.drawable.space_needle, getString(R.string.space_needle_details)));
        locations.add(new Location(getString(R.string.gum_wall_title), R.drawable.gum_wall, getString(R.string.gum_wall_details)));
        locations.add(new Location(getString(R.string.great_wheel_title), R.drawable.great_wheel, getString(R.string.great_wheel_details)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
