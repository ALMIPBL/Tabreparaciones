package com.almi.jon.tabreparaciones;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dam2-jon on 30/10/2017.
 */

public class TabSmartphones extends Fragment {
        private static final String TAG = "TabSmartphones";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabsmartphones_fragment,container,false);
        return view;
    }
}
