package com.derisse.hollyn.fragments.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.derisse.hollyn.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentModularText extends Fragment {

    TextView textModular;

    public FragmentModularText() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_modular_text, container, false);
        textModular = (TextView)view.findViewById(R.id.textModular);
        return view;
    }

    public void changeData(int i){
        String description[] = getResources().getStringArray(R.array.descriptions);
        textModular.setText(description[i]);
    }

}
