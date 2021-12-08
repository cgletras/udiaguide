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
 * Use the {@link NatureFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static NatureFragment newInstance() {
        NatureFragment fragment = new NatureFragment();
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

        attractions.add(new TouristicAttraction("Cachoeira Sucupira", R.drawable.cahoeirasucupira, "https://goo.gl/maps/71dRXyGJkdRdPqvY6"));
        attractions.add(new TouristicAttraction("Cachoeira Bom Jardim", R.drawable.cachoeirabomjardim, "https://goo.gl/maps/htdieQDKmc4exkmV8"));
        attractions.add(new TouristicAttraction("Cachoeira das Irmãs", R.drawable.cachoeiradasirmas, "https://goo.gl/maps/G4QLDNqjxR67EdMTA"));
        attractions.add(new TouristicAttraction("Cachoeira dos Namorados", R.drawable.cachoeiradosnamorados, "https://goo.gl/maps/vE4wN6kTzZfu2saS9"));
        attractions.add(new TouristicAttraction("Cachoeira da Fumaça", R.drawable.cachoeiradafumaca, "https://goo.gl/maps/rcuL7ZDkYfFxgiCj6"));



        //Declare the adapter
        AttractionsItemListAdapter adapter = new AttractionsItemListAdapter(getActivity(), attractions);

        //set the list view
        ListView listView = (ListView) rootView.findViewById(R.id.lv_attractions);

        //Set listView adapter
        listView.setAdapter(adapter);

        return rootView;
    }
}