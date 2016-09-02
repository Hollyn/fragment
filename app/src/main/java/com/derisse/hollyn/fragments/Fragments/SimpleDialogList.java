package com.derisse.hollyn.fragments.Fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.derisse.hollyn.fragments.R;

/**
 * Created by hollyn on 4/23/16.
 */
public class SimpleDialogList extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("A Simple Dialog With a List");
        builder.setItems(R.array.title, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Item " + i + " is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Dialog dialog = builder.create();
        return dialog;
    }
}
