package com.derisse.hollyn.fragments.Activities;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentManager;

import com.derisse.hollyn.fragments.Fragments.FragmentB;
import com.derisse.hollyn.fragments.Interfaces.Communicator;
import com.derisse.hollyn.fragments.R;

public class CommunicationBetween2Fragments extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_between2_fragments);
    }

    @Override
    public void respond(String data) {
        android.app.FragmentManager manager = getFragmentManager();
        FragmentB fragmentB = (FragmentB)manager.findFragmentById(R.id.fragment3);
        fragmentB.changeText(data);
    }
}
