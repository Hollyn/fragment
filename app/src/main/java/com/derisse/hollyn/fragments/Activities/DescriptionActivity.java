package com.derisse.hollyn.fragments.Activities;

import android.os.Bundle;
import android.app.Activity;

import com.derisse.hollyn.fragments.Fragments.FragmentModularText;
import com.derisse.hollyn.fragments.R;

public class DescriptionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        FragmentModularText fragmentModularText = (FragmentModularText) getFragmentManager().findFragmentById(R.id.fragment7);
        if (fragmentModularText != null)
            fragmentModularText.changeData(getIntent().getIntExtra("i", 0));
    }

}
