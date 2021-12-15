package com.example.guiaudia.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.guiaudia.R;
import com.example.guiaudia.TouristicAttraction;
import com.example.guiaudia.adapter.AttractionsItemListAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParksSquaresGardensFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParksSquaresGardensFragment extends Fragment {

    public ParksSquaresGardensFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ParksSquaresGardensFragment newInstance() {
        ParksSquaresGardensFragment fragment = new ParksSquaresGardensFragment();
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

        attractions.add(new TouristicAttraction("Parque do Sabiá", R.drawable.parquedosabia, "Av. Anselmo Alves dos Santos, 3090"));
        attractions.add(new TouristicAttraction("Parque Municipal Santa Luzia", R.drawable.parquesantaluzia, "Av. Alípio Abraão, 602"));
        attractions.add(new TouristicAttraction("Parque Linear Lagoinha", R.drawable.parquelagoinha, "Av. Antônio Francisco Lisboa, 131-211"));



        //Declare the adapter
        AttractionsItemListAdapter adapter = new AttractionsItemListAdapter(getActivity(), attractions);

        //set the list view
        ListView listView = (ListView) rootView.findViewById(R.id.lv_attractions);

        //Set listView adapter
        listView.setAdapter(adapter);

        return rootView;
    }
}