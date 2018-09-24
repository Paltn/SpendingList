package com.example.pcardoso.spendinglist.view.activity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.databinding.ActivityAddExpenseBinding;
import com.example.pcardoso.spendinglist.view.adapter.CustomAdapter;
import com.example.pcardoso.spendinglist.viewmodelss.AddExpenseViewModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddExpenseActivity extends AppCompatActivity {

    private static final String TAG = AddExpenseActivity.class.getSimpleName();
    ActivityAddExpenseBinding binding;
    DatePickerDialog picker;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private AddExpenseViewModel viewModel;

    @SuppressLint("SimpleDateFormat")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_expense);

        /* call the class ViewModel */
        viewModel = ViewModelProviders.of(this).get(AddExpenseViewModel.class);
        binding.setViewModel(viewModel);

        //dateFormat = new SimpleDateFormat("dd.MMM.yyy");
        //binding.editData.setText(dateFormat.format(new Date()));

        listAdpAccount(binding.spinnerAccount);//call mcustomadapter
        listAdpCategory(binding.spinnerCategory);
        openCalendar();

    }

    private void listAdpAccount(Spinner spinnerAccount) {

        Integer[] images = {R.drawable.wallet, R.drawable.creditcard, R.drawable.bank};

        CustomAdapter customAdapter = new CustomAdapter(AddExpenseActivity.this,
                getResources().getStringArray(R.array.namesAccount), images);
        spinnerAccount.setAdapter(customAdapter);


    }

    private void listAdpCategory(Spinner spCategory) {

        Integer[] images = {R.drawable.beachddexpense,
                R.drawable.restaurantddexpense,
                R.drawable.carddexpense, R.drawable.wateraddexpense,
                R.drawable.lightddexpense,
                R.drawable.bedddexpense};

        CustomAdapter custcatey = new CustomAdapter(AddExpenseActivity.this,
                getResources().getStringArray(R.array.namescategory), images);
        spCategory.setAdapter(custcatey);

    }

    private void openCalendar() {
        binding.editData.setInputType(InputType.TYPE_NULL);

        binding.editData.setOnClickListener(new View.OnClickListener() {

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
                                Log.d(TAG,"My string DATEEE is: " + viewModel.getExpense().getStringDate());
                                // viewModel.getExpense().setStringDate(dayOfMonth + "." + (monthOfYear + 1) + "." + year);
                                binding.editData.setText(dayOfMonth + "." + (monthOfYear + 1) + "." + year);
                            }

                        }, year, month, day);
                picker.show();
            }
        });


        //para limpar edittext e dropdown
        binding.btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Log.d(TAG,"My title is: " + viewModel.getExpense().getTitle());
                Log.d(TAG,"My description is: " + viewModel.getExpense().getDescription());
                Log.d(TAG,"My string DATEEE is: " + viewModel.getExpense().getStringDate());
                Log.d(TAG,"My category is: " + viewModel.getExpense().getCategory());*/

                binding.spinnerAccount.setSelection(0);
                binding.edtAmount.setText("");
                binding.edtTitle.setText("");
                binding.spinnerCategory.setSelection(0);
                binding.editDescrition.setText("");
                //dateFormat var globaal
                binding.editData.setText(dateFormat.format(new Date()));
            }
        });
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }

}
