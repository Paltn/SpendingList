package com.example.pcardoso.spendinglist.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pcardoso.spendinglist.Fragments.CreateAccountFragment;
import com.example.pcardoso.spendinglist.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnlogin = (Button) view.findViewById(R.id.btnlogin);

        Button btnregister = (Button) view.findViewById(R.id.btnregister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main, new EditProfileFragment());
                fr.addToBackStack(null).commit();


            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main, new CreateAccountFragment());
                fr.addToBackStack(null).commit();


            }
        });

        // Inflate the layout for this fragment
        return view;
    }



}
