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

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        Log.i("Fragment Check ", "Restaurants Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.hitchcock_title), R.drawable.hitchcock, getString(R.string.hitchcock_details)));
        locations.add(new Location(getString(R.string.flintcreek_title), R.drawable.flintcreek, getString(R.string.flintcreek_details)));
        locations.add(new Location(getString(R.string.cafe_munir_title), R.drawable.cafemunir, getString(R.string.cafe_munir_details)));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
