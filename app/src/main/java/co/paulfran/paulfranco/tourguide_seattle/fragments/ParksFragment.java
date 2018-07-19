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

public class ParksFragment extends Fragment {

    public ParksFragment() {
        Log.i("Fragment Check ", "Parks Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.alki_beach_title), R.drawable.alki_beach, getString(R.string.alki_details)));
        locations.add(new Location(getString(R.string.seward_park_title), R.drawable.seward, getString(R.string.seward_park_details)));
        locations.add(new Location(getString(R.string.carkeek_title), R.drawable.carkeek, getString(R.string.carkeek_details)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
