package com.example.guiaudia.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.guiaudia.R;
import com.example.guiaudia.TouristicAttraction;
import com.example.guiaudia.adapter.AttractionsItemListAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CinemaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CinemaFragment extends Fragment {

    public CinemaFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CinemaFragment newInstance() {
        CinemaFragment fragment = new CinemaFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attractions_list_frag_layout, container, false);

        //Set list
        ArrayList<TouristicAttraction> attractions = new ArrayList<TouristicAttraction>();

        attractions.add(new TouristicAttraction("Cinemark", R.drawable.cinemark, "Av. Paulo Gracindo, 15"));
        attractions.add(new TouristicAttraction("Cinepolis", R.drawable.cinepolis, "Av. João Naves de Ávila, 1331"));

        //Declare the adapter
        AttractionsItemListAdapter adapter = new AttractionsItemListAdapter(getActivity(), attractions);

        //set the list view
        ListView listView = rootView.findViewById(R.id.lv_attractions);

        //Set listView adapter
        listView.setAdapter(adapter);

        return rootView;
    }
}