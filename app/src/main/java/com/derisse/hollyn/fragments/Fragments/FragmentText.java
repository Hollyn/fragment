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
public class FragmentText extends Fragment {

    TextView textView;
    int i;

    public FragmentText() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView)getActivity().findViewById(R.id.textview);
        if(savedInstanceState != null){
            i = savedInstanceState.getInt("i", 0);
            String description[] = getResources().getStringArray(R.array.descriptions);
            textView.setText(description[i]);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("i", i);
    }

    public void  changeText(int i){
        this.i = i;
        String description[] = getResources().getStringArray(R.array.descriptions);
        textView.setText(description[i]);
    }

}
