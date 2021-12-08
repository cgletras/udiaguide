package com.example.guiaudia.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guiaudia.R;

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
    public static ParksSquaresGardensFragment newInstance(String param1, String param2) {
        ParksSquaresGardensFragment fragment = new ParksSquaresGardensFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}