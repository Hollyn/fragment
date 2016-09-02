package com.derisse.hollyn.fragments.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.derisse.hollyn.fragments.R;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class FragmentTest extends Fragment{


    public FragmentTest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

}
