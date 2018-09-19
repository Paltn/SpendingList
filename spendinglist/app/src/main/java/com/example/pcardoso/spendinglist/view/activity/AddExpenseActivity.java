package com.example.pcardoso.spendinglist.view.activity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.databinding.ActivityAddExpenseBinding;
import com.example.pcardoso.spendinglist.view.adapter.CustomAdapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddExpenseActivity extends AppCompatActivity {

    DatePickerDialog picker;
    SimpleDateFormat dateFormat;

    ActivityAddExpenseBinding binding;

    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_expense);
        binding.editdate.setText(dateFormat.format(new Date()));

        mcustomadapter(binding.spinnerAccount);//call mcustomadapter
        mcustomadaptercategory(binding.spinnerCategory);
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

        binding.editdate.setInputType(InputType.TYPE_NULL);

        binding.editdate.setOnClickListener(new View.OnClickListener() {

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

                                binding.editdate.setText(dayOfMonth + "." + (monthOfYear + 1) + "." + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        binding.btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.spinnerAccount.setSelection(0);
                binding.edtAmount.setText("");
                binding.edtTitle.setText("");
                binding.spinnerCategory.setSelection(0);
                binding.editDescrition.setText("");

                //dateFormat var globaal
                binding.editdate.setText(dateFormat.format(new Date()));

            }
        });

    }


    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }


}
