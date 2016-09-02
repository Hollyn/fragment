package com.derisse.hollyn.fragments.Fragments;


import android.os.Bundle;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.derisse.hollyn.fragments.R;

/**
 * A simple {@link ListFragment} subclass.
 */
public class SimpleFragmentList extends ListFragment implements AdapterView.OnItemClickListener {


    public SimpleFragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Adapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.title, android.R.layout.simple_expandable_list_item_1);
        setListAdapter((ListAdapter) adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_fragment_list, container, false);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getActivity(), "Item" + i, Toast.LENGTH_LONG).show();
    }
}
