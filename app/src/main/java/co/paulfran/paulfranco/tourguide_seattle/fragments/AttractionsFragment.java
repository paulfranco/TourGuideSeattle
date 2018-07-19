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

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        Log.i("Fragment Check: ", "Attractions Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.museum_pop_title), R.drawable.mopop, getString(R.string.museum_pop_details)));
        locations.add(new Location(getString(R.string.underground_title), R.drawable.underground, getString(R.string.underground_details)));
        locations.add(new Location(getString(R.string.ducks_title), R.drawable.duck, getString(R.string.ducks_details)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
