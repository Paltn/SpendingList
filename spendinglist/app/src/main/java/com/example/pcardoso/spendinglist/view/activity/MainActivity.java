package com.example.pcardoso.spendinglist.view.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.view.fragment.users.CreateAccountFragment;
import com.example.pcardoso.spendinglist.view.fragment.users.LoginFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


}
