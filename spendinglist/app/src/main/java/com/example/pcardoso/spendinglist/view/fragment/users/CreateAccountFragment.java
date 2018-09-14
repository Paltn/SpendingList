package com.example.pcardoso.spendinglist.view.fragment.users;



import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;


import com.example.pcardoso.spendinglist.databinding.FragmentCreateAccountBinding;


public class CreateAccountFragment extends Fragment {

    //FragmentCreateAccountBinding binding;
    FragmentCreateAccountBinding binding;
    public CreateAccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_create_account, container, false);
        //binding.setBatatas(this);
        return binding.getRoot();
    }

    public void onClick() {

        if (binding.edtpasswords.getText().toString().equals( binding.edtnewpassword.getText().toString() ))
            Toast.makeText(getActivity(), "Register", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getActivity(), "Not Iquals", Toast.LENGTH_LONG).show();
    }

}