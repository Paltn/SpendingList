package com.example.pcardoso.spendinglist.view.activity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.view.adapter.CustomAdapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddExpenseActivity extends AppCompatActivity {

    EditText date;
    DatePickerDialog picker;

    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        date = findViewById(R.id.editdate);

        final Spinner spinnerAccount = findViewById(R.id.spinner_account);
        final Spinner spCategory = findViewById(R.id.spinner_category);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        date.setText(dateFormat.format(new Date()));
        dateFormat = new SimpleDateFormat("dd.MMM.yyy");
        date.setText(dateFormat.format(new Date()));

        mcustomadapter(spinnerAccount);//call mcustomadapter
        mcustomadaptercategory(spCategory);
        mcalendar();
    }

    private void mcustomadapter(Spinner spinnerAccount) {

        Integer[] images = {R.drawable.wallet, R.drawable.creditcard, R.drawable.bank};

        CustomAdapter customAdapter = new CustomAdapter(AddExpenseActivity.this,
                getResources().getStringArray(R.array.namesAccount), images);
        spinnerAccount.setAdapter(customAdapter);

    }

    private void mcustomadaptercategory(Spinner spCategory) {

        Integer[] images = {R.drawable.beachddexpense,
                R.drawable.restaurantddexpense,
                R.drawable.carddexpense, R.drawable.wateraddexpense,
                R.drawable.lightddexpense,
                R.drawable.bedddexpense};

        CustomAdapter custcatey = new CustomAdapter(AddExpenseActivity.this,
                getResources().getStringArray(R.array.namescategory), images);
        spCategory.setAdapter(custcatey);

    }

    private void mcalendar() {

        date.setInputType(InputType.TYPE_NULL);

        date.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                picker = new DatePickerDialog(AddExpenseActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                date.setText(dayOfMonth + "." + (monthOfYear + 1) + "." + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }


    public void btnnew (View v)
    {
        Intent call = new Intent(this, AddExpenseActivity.class);
        startActivity(call);
    }


}
