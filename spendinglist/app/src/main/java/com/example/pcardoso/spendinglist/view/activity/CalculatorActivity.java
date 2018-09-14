package com.example.pcardoso.spendinglist.view.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.view.fragment.calculator.CalculatorFragment;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculator);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frmlt, new CalculatorFragment());
        fragmentTransaction.commit();
    }
}
