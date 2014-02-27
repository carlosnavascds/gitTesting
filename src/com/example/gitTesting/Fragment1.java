package com.example.gitTesting;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by carlosnavas on 26/02/14.
 */
public class Fragment1 extends Fragment {

    public static Fragment1 newInstance() {

        Fragment1 f = new Fragment1();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment1, null);


        return  v;
    }
}
