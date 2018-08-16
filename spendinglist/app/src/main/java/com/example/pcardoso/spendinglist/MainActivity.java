package com.example.pcardoso.spendinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pcardoso.spendinglist.Fragments.LoginFragment;
import com.example.pcardoso.spendinglist.Fragments.NotificationFragment;
import com.example.pcardoso.spendinglist.Fragments.ToolbarFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState ==null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.main, new LoginFragment() ).commit();
        }


    }



}
