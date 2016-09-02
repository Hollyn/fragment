package com.derisse.hollyn.fragments.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.derisse.hollyn.fragments.Interfaces.Communicator;
import com.derisse.hollyn.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment implements View.OnClickListener{

    Button clickMe;
    int counter;
    Communicator comm;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(savedInstanceState == null)
            counter = 0;
        else
            counter = savedInstanceState.getInt("counter", 0);
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        clickMe = (Button)getActivity().findViewById(R.id.clickMe);
        clickMe.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    @Override
    public void onClick(View view) {
        counter++;
        comm.respond("The button has been clicked " + counter + " time" + (counter > 1 ? "s." : "."));
    }
}
