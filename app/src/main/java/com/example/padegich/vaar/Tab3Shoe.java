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
public class Tab3Shoe extends Fragment {
    private static final String TAG = "Tab3Shoe";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab3_shoe,container,false);
        return view;
    }

}
