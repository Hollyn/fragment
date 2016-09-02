package com.derisse.hollyn.fragments.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.derisse.hollyn.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentModularList extends Fragment implements AdapterView.OnItemClickListener{

    Communicator1 comm;
    ListView list;

    public FragmentModularList() {
        // Required empty public constructor
    }

    public void setCommunicator(Communicator1 communicator){
        comm = communicator;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = (ListView)getActivity().findViewById(R.id.list);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.title, android.R.layout.simple_expandable_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modular_list, container, false);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        comm.respond(i);
    }

    public interface Communicator1{
        public void respond(int i);
    }
}
