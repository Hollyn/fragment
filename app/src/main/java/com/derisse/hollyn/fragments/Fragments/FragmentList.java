package com.derisse.hollyn.fragments.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.derisse.hollyn.fragments.Interfaces.Communicator2;
import com.derisse.hollyn.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentList extends Fragment implements AdapterView.OnItemClickListener{

    ListView list;
    Communicator2 comm;

    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator2) getActivity();
        list = (ListView)getActivity().findViewById(R.id.listView);
        Adapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.title, android.R.layout.simple_expandable_list_item_1);
        list.setAdapter((ListAdapter) adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        comm.respond(i);
        //Toast.makeText(getActivity(), "i = " + i, Toast.LENGTH_LONG).show();
    }
}
