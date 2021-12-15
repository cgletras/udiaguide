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

        attractions.add(new TouristicAttraction("Cachoeira Sucupira", R.drawable.cahoeirasucupira, "-18.986757", "-48.1687354"));
        attractions.add(new TouristicAttraction("Cachoeira Bom Jardim", R.drawable.cachoeirabomjardim, "-19.001418","-48.2723114"));
        attractions.add(new TouristicAttraction("Cachoeira das Irmãs", R.drawable.cachoeiradasirmas, "-18.6699712","-48.0705498"));
        attractions.add(new TouristicAttraction("Cachoeira dos Namorados", R.drawable.cachoeiradosnamorados, "-18.9902353","-48.1756701"));
        attractions.add(new TouristicAttraction("Cachoeira da Fumaça", R.drawable.cachoeiradafumaca, "-19.2228403","-47.8111266"));

        //Declare the adapter
        AttractionsItemListAdapter adapter = new AttractionsItemListAdapter(getActivity(), attractions);

        //set the list view
        ListView listView = (ListView) rootView.findViewById(R.id.lv_attractions);

        //Set listView adapter
        listView.setAdapter(adapter);

        return rootView;
    }
}