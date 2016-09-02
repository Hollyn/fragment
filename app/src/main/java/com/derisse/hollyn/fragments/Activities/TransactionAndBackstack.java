package com.derisse.hollyn.fragments.Activities;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.derisse.hollyn.fragments.Fragments.FragmentTransactionA;
import com.derisse.hollyn.fragments.Fragments.FragmentTransactionB;
import com.derisse.hollyn.fragments.R;

public class TransactionAndBackstack extends Activity implements FragmentManager.OnBackStackChangedListener {

    FragmentManager manager;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_and_backstack);

        manager = getFragmentManager();
        status = (TextView) findViewById(R.id.status);
        manager.addOnBackStackChangedListener(this);
    }

    public void addA(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionA fragmentTransactionA = new FragmentTransactionA();
        transaction.add(R.id.group, fragmentTransactionA, "fragmentA");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionB fragmentTransactionB = new FragmentTransactionB();
        transaction.add(R.id.group, fragmentTransactionB, "fragmentB");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeA(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionA fragmentTransactionA = (FragmentTransactionA) manager.findFragmentByTag("fragmentA");
        if (fragmentTransactionA != null) {
            transaction.remove(fragmentTransactionA);
            transaction.addToBackStack("removeA");
            transaction.commit();
        } else
            Toast.makeText(this, "Fragment must be added before", Toast.LENGTH_LONG).show();
    }

    public void removeB(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionB fragmentTransactionB = (FragmentTransactionB) manager.findFragmentByTag("fragmentB");
        if (fragmentTransactionB != null) {
            transaction.remove(fragmentTransactionB);
            transaction.addToBackStack("removeB");
            transaction.commit();
        } else
            Toast.makeText(this, "Fragment must be added before", Toast.LENGTH_LONG).show();
    }

    public void attachA(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionA fragmentTransactionA = (FragmentTransactionA) manager.findFragmentByTag("fragmentA");
        if(fragmentTransactionA != null) {
            transaction.attach(fragmentTransactionA);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }
    }

    public void detachA(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionA fragmentTransactionA = (FragmentTransactionA) manager.findFragmentByTag("fragmentA");
        if(fragmentTransactionA != null) {
            transaction.detach(fragmentTransactionA);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }

    public void replaceA(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionA fragmentTransactionA = new FragmentTransactionA();
        transaction.replace(R.id.group, fragmentTransactionA, "fragmentA");
        transaction.addToBackStack("replaceA");
        transaction.commit();
    }

    public void replaceB(View view) {
        FragmentTransaction transaction = manager.beginTransaction();
        FragmentTransactionB fragmentTransactionB = new FragmentTransactionB();
        transaction.replace(R.id.group, fragmentTransactionB, "FragmentB");
        transaction.addToBackStack("replaceB");
        transaction.commit();
    }

    public void back(View view) {
        manager.popBackStack();
    }

    public void popB(View view) {
        manager.popBackStack("addB", 0);
    }

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    public void onBackStackChanged() {
        int count = manager.getBackStackEntryCount();
        String list = "";
        for (int i = count - 1; i >= 0; i--) {
            FragmentManager.BackStackEntry entry = manager.getBackStackEntryAt(i);
            list += entry.getName() + '\n';
        }
        status.setText(list);
    }
}
