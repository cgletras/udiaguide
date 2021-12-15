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
 * Use the {@link MuseumsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MuseumsFragment newInstance() {
        MuseumsFragment fragment = new MuseumsFragment();
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

        attractions.add(new TouristicAttraction("Museu Municipal", R.drawable.museumunicipal, "Praça Clarimundo Carneiro, 67"));
        attractions.add(new TouristicAttraction("Museu do Índio", R.drawable.museudoindio, "Rua Vitalino Resende do Carmo, 116"));
        attractions.add(new TouristicAttraction("Muna\nMuseu Universitário", R.drawable.muna, "Praça Cícero Macedo, 309"));
        attractions.add(new TouristicAttraction("Museu da Biodiversidade", R.drawable.museubiodiversidade, "Avenida Nossa Senhora do Carmo, 707"));

        //Declare the adapter
        AttractionsItemListAdapter adapter = new AttractionsItemListAdapter(getActivity(), attractions);

        //set the list view
        ListView listView = rootView.findViewById(R.id.lv_attractions);

        //Set listView adapter
        listView.setAdapter(adapter);

        return rootView;
    }
}