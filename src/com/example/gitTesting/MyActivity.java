package com.example.gitTesting;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class MyActivity extends Activity {
    Fragment fragment;
    private static int nextFragment;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        fragment = Fragment1.newInstance();
        nextFragment = 2;
        getFragmentManager().beginTransaction().add(android.R.id.content, fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 1, 0, "Notes").setIcon(android.R.drawable.ic_btn_speak_now)
                .setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (nextFragment > 1)
            nextFragment = nextFragment -1;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 1){
            // Change Fragment

            switch (nextFragment){
                case 1:
                {
                    fragment = Fragment1.newInstance();
                    getFragmentManager().beginTransaction().replace(android.R.id.content, fragment).addToBackStack(null).commit();
                    nextFragment = 2;
                }

                break;
                case 2:
                {
                    fragment = Fragment2.newInstance();
                    getFragmentManager().beginTransaction().replace(android.R.id.content, fragment).addToBackStack(null).commit();
                    nextFragment = 3;
                }

                break;
                case 3:
                {
                    fragment = Fragment3.newInstance();
                    getFragmentManager().beginTransaction().replace(android.R.id.content, fragment).addToBackStack(null).commit();
                    nextFragment = 1;
                }

                break;
            }
        }
        return false;
    }
}
