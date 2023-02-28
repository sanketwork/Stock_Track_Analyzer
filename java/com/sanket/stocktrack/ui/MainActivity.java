package com.sanket.stocktrack.ui;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.sanket.stocktrack.R;
import com.sanket.stocktrack.adapters.QuotesListAdapter;
import com.sanket.stocktrack.fragments.HomeFragment;
import com.sanket.stocktrack.fragments.NewsFragment;
import com.sanket.stocktrack.fragments.ProfileFragment;
import com.sanket.stocktrack.model.Quote;
import com.sanket.stocktrack.model.StocksModel;
import com.sanket.stocktrack.service.IEXService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.frameContainer) FrameLayout mFrameLayout;
    @BindView(R.id.navigationView) BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        getQuotes();
    //Init Fragments
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new HomeFragment());

    }

 private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
     @Override
     public boolean onNavigationItemSelected(@NonNull MenuItem item) {
         Fragment fragment;
         switch (item.getItemId()){
             case R.id.navigation_home:
                 fragment = new HomeFragment();
                 loadFragment(fragment);
                 return true;
             case R.id.navigation_news:
                 fragment = new NewsFragment();
                 loadFragment(fragment);
                 return true;
             case R.id.navigation_profile:
                 fragment = new ProfileFragment();
                 loadFragment(fragment);
                 return true;
         }
         return false;
     }
 };

    private void loadFragment(Fragment fragment) {
//        Load the fragments
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContainer,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
