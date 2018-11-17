package com.example.padegich.vaar;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class ShopActivity extends AppCompatActivity {
    private static final String TAG = "ShopActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        Log.d(TAG, "onCreate:Starting.");


        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tablayout = findViewById(R.id.tabs);
        tablayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Dress(), "Dresses!");
        adapter.addFragment(new Tab2Hat(), "Hats!");
        adapter.addFragment(new Tab3Shoe(),"Shoes!");
        viewPager.setAdapter(adapter);
    }

}
