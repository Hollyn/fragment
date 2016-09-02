package com.derisse.hollyn.fragments.Activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.derisse.hollyn.fragments.Fragments.CustomDialog;
import com.derisse.hollyn.fragments.Fragments.SimpleDialogList;
import com.derisse.hollyn.fragments.Fragments.SimpleDialogMultichoice;
import com.derisse.hollyn.fragments.Fragments.SimpleDialogText;
import com.derisse.hollyn.fragments.R;

public class Dialogs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);
    }

    public void simpleDialog(View view){
        SimpleDialogText simpleDialogText = new SimpleDialogText();
        simpleDialogText.show(getFragmentManager(), "simple dialog");
    }

    public void simpleDialogList(View view){
        SimpleDialogList simpleDialogList = new SimpleDialogList();
        simpleDialogList.show(getFragmentManager(), "simple dialog list");
    }

    public void simpleDialogMultichoice(View view){
        SimpleDialogMultichoice simpleDialogMultichoice = new SimpleDialogMultichoice();
        simpleDialogMultichoice.show(getFragmentManager(), "simple dialog with multichoice list");
    }

    public void customDialog(View view){
        CustomDialog customDialog = new CustomDialog();
        customDialog.show(getFragmentManager(), "custom dialog");
    }

    public void customDialogAsFragment(View view){
        CustomDialog customDialog = new CustomDialog();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.group, customDialog, "custom dialog as fragment");
        transaction.commit();
    }

}
