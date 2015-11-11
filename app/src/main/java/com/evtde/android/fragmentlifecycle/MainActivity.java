package com.evtde.android.fragmentlifecycle;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater() ;
        inflater.inflate(R.menu.main_menu, menu) ;
        return true;
    }

    public void onMenuList(MenuItem item)
    {
        startActivity(new Intent(this, MyListActivity.class));
    }

    public void onMenuDialog(MenuItem item)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        MyDialogFragment theFragment = new MyDialogFragment();
//        theFragment.show(fragmentManager, "My dialog");

        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        theFragment.show(fragmentTransaction,"My Dialog");
    }

    public void onMenuDialogWrapped(MenuItem item)
    {
    }

    public void onMenuDialogAdd(MenuItem item)
    {
    }

    public void onMenuQuit(MenuItem item)
    {
        finish();
    }
}
