package com.derisse.hollyn.fragments.Activities;

import android.os.Bundle;
import android.app.Activity;

import com.derisse.hollyn.fragments.Fragments.FragmentText;
import com.derisse.hollyn.fragments.Interfaces.Communicator2;
import com.derisse.hollyn.fragments.R;

public class FlexibleUserInterface extends Activity implements Communicator2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexible_user_interface);
    }

    @Override
    public void respond(int i) {
        android.app.FragmentManager manager = getFragmentManager();
        FragmentText fragmentText = (FragmentText) manager.findFragmentById(R.id.fragment5);
        fragmentText.changeText(i);
    }
}
