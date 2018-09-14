package com.example.pcardoso.spendinglist.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.view.adapter.CustomAdapter;

public class AddExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        Integer[] images = {R.drawable.category,R.drawable.budget,R.drawable.itemyeye};
        CustomAdapter customAdapter = new CustomAdapter(AddExpenseActivity.this,
                getResources().getStringArray(R.array.nomes),images);

        Spinner spinnerAccount = findViewById(R.id.spinner_account);
        spinnerAccount.setAdapter(customAdapter);

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }
}
