package co.paulfran.paulfranco.tourguide_seattle.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import co.paulfran.paulfranco.tourguide_seattle.app.Location;
import co.paulfran.paulfranco.tourguide_seattle.R;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView nameText = listItemView.findViewById(R.id.locationName);
        nameText.setText(currentLocation.getName());

        TextView detailsText = listItemView.findViewById(R.id.locationDetails);
        if (currentLocation.getDetails() == null) {
            detailsText.setVisibility(View.GONE);
        }
        detailsText.setText(currentLocation.getDetails());

        ImageView locationImage = listItemView.findViewById(R.id.locationImage);
        if (currentLocation.hasImage()) {
            locationImage.setImageResource(currentLocation.getImageId());
            locationImage.setVisibility(View.VISIBLE);
        } else {
            locationImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
