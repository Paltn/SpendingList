package com.example.pcardoso.spendinglist.Fragments;


import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToolbarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_toolbar, container, false);

        BottomNavigationView navigationView = view.findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(onCreateView);

       // View view = inflater.inflate(R.layout.fragment_login, container, false);
        //Button btnregister = (Button) view.findViewById(R.id.btnregister);


        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        return view;

    }
    public BottomNavigationView.OnNavigationItemSelectedListener onCreateView
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(getActivity(), "HOME",
                            Toast.LENGTH_LONG).show();

                    return true;

                case R.id.navigation_notifications:
                    Toast.makeText(getActivity(), "Notifications",
                            Toast.LENGTH_LONG).show();

                    return true;
            }
            return false;
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }


}
