package com.example.padegich.vaar;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author padegich on 10/27/18.
 * @project VaAR-master
 */
public class Tab1Dress extends Fragment {
    private static final String TAG = "Tab1Dress";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab1_dress,container,false);
        return view;
    }

}
