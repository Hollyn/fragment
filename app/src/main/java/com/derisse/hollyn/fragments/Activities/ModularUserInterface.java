package com.derisse.hollyn.fragments.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.derisse.hollyn.fragments.Fragments.FragmentModularList;
import com.derisse.hollyn.fragments.Fragments.FragmentModularText;
import com.derisse.hollyn.fragments.R;

public class ModularUserInterface extends Activity implements FragmentModularList.Communicator1{

    FragmentModularList fragmentModularList;
    FragmentModularText fragmentModularText;
    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modular_user_interface);

        manager = getFragmentManager();
        fragmentModularList = (FragmentModularList) manager.findFragmentById(R.id.fragment6);
        fragmentModularList.setCommunicator(this);
    }

    @Override
    public void respond(int i) {
        fragmentModularText = (FragmentModularText) manager.findFragmentById(R.id.fragment7);
        if (fragmentModularText != null && fragmentModularText.isVisible())
            fragmentModularText.changeData(i);
        else{
            Intent intent = new Intent(ModularUserInterface.this, DescriptionActivity.class);
            //intent.putExtra("i", i);
            startActivity(intent);
        }
    }
}
