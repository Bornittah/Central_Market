package com.example.bornittah.central_market.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bornittah.central_market.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Vegetables extends Fragment {


    public Vegetables() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vegetables2, container, false);
    }

}
