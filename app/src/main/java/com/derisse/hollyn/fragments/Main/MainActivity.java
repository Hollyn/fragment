package com.derisse.hollyn.fragments.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.derisse.hollyn.fragments.Activities.AddFragmentWithJavaCode;
import com.derisse.hollyn.fragments.Activities.AddFragmentWithXml;
import com.derisse.hollyn.fragments.Activities.CommunicationBetween2Fragments;
import com.derisse.hollyn.fragments.Activities.Dialogs;
import com.derisse.hollyn.fragments.Activities.FlexibleUserInterface;
import com.derisse.hollyn.fragments.Activities.ListFragment;
import com.derisse.hollyn.fragments.Activities.ModularUserInterface;
import com.derisse.hollyn.fragments.Activities.SlideTab;
import com.derisse.hollyn.fragments.Activities.SwipeTab;
import com.derisse.hollyn.fragments.Activities.TransactionAndBackstack;
import com.derisse.hollyn.fragments.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button fragmentxml, fragmentjava, fragmentcommunication,
            flexibleUI, modularUI, transactionBackstack, fragmentList, dialogs, slideTab, swipeTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
        clickListener();
    }

    public void init(){
        fragmentcommunication = (Button)findViewById(R.id.fragment_communication);
        fragmentjava = (Button)findViewById(R.id.fragment_java_code);
        fragmentxml = (Button)findViewById(R.id.fragment_xml);
        flexibleUI = (Button)findViewById(R.id.flexibleUI);
        modularUI = (Button)findViewById(R.id.modularUI);
        transactionBackstack = (Button)findViewById(R.id.transactionBackstack);
        fragmentList = (Button)findViewById(R.id.fragmentList);
        dialogs = (Button)findViewById(R.id.dialogs);
        slideTab = (Button)findViewById(R.id.slideTab);
        swipeTab = (Button)findViewById(R.id.swipeTab);
    }

    public void clickListener(){
        fragmentcommunication.setOnClickListener(this);
        fragmentxml.setOnClickListener(this);
        fragmentjava.setOnClickListener(this);
        flexibleUI.setOnClickListener(this);
        modularUI.setOnClickListener(this);
        transactionBackstack.setOnClickListener(this);
        fragmentList.setOnClickListener(this);
        slideTab.setOnClickListener(this);
        swipeTab.setOnClickListener(this);
        dialogs.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fragment_xml:
                startActivity(new Intent(this, AddFragmentWithXml.class));
                break;
            case R.id.fragment_java_code:
                startActivity(new Intent(this, AddFragmentWithJavaCode.class));
                break;
            case R.id.fragment_communication:
                startActivity(new Intent(this, CommunicationBetween2Fragments.class));
                break;
            case R.id.flexibleUI:
                startActivity(new Intent(this, FlexibleUserInterface.class));
                break;
            case R.id.modularUI:
                startActivity(new Intent(this, ModularUserInterface.class));
                break;
            case R.id.transactionBackstack:
                startActivity(new Intent(this, TransactionAndBackstack.class));
                break;
            case R.id.fragmentList:
                startActivity(new Intent(this, ListFragment.class));
                break;
            case R.id.dialogs:
                startActivity(new Intent(this, Dialogs.class));
                break;
            case R.id.slideTab:
                startActivity(new Intent(this, SlideTab.class));
                break;
            case R.id.swipeTab:
               // startActivity(new Intent(this, SwipeTab.class));
                Toast.makeText(this, "In production ;)", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
