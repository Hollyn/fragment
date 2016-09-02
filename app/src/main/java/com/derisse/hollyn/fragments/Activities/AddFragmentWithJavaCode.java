package com.derisse.hollyn.fragments.Activities;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentManager;

import com.derisse.hollyn.fragments.Fragments.FragmentWithCode;
import com.derisse.hollyn.fragments.R;

public class AddFragmentWithJavaCode extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fragment_with_java_code);


        FragmentWithCode frag = new FragmentWithCode();
        android.app.FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.add_fragment_java_code, frag, "My fragment");
        transaction.commit();

    }

}
