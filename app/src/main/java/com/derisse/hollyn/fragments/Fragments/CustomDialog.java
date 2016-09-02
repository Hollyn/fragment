package com.derisse.hollyn.fragments.Fragments;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.derisse.hollyn.fragments.R;

/**
 * A simple {@link DialogFragment} subclass.
 */
public class CustomDialog extends DialogFragment {


    public CustomDialog() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_custom_dialog, container, false);
    }
}
