package com.example.guiaudia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.guiaudia.R;
import com.example.guiaudia.TouristicAttraction;

import java.util.List;

public class AttractionsItemListAdapter extends ArrayAdapter<TouristicAttraction> {
    public AttractionsItemListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public AttractionsItemListAdapter(@NonNull Context context, @NonNull List<TouristicAttraction> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Check if view is being reused
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list_attractions, parent, false
            );
        }

        //get the object in the list
        TouristicAttraction currentItemAttraction = getItem(position);

        // Select the views to be populated
        TextView attractionName = listItemView.findViewById(R.id.tv_item_name);
        TextView attractionAddress = listItemView.findViewById(R.id.tv_item_address);
        ImageView attractionImage = listItemView.findViewById(R.id.iv_item_image);

        // Set info from class into view
        attractionName.setText(currentItemAttraction.getmName());
        attractionAddress.setText(currentItemAttraction.getmAddress());
        attractionImage.setImageResource(currentItemAttraction.getmImageId());

        return listItemView;
    }
}
