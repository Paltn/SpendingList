package com.example.pcardoso.spendinglist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.pcardoso.spendinglist.expenses.AddExpensesFragment;
import com.example.pcardoso.spendinglist.users.CreateAccountFragment;
import com.example.pcardoso.spendinglist.users.LoginFragment;

public class MainActivity extends AppCompatActivity {

   // private static final String TAG = "MainActivity";
    private SharedPreferences preferences;
    private  SharedPreferences.Editor editor;

    private EditText memail;
    private EditText mpassword;
    private Button btnlogin;
    private CheckBox mcheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
       if (savedInstanceState ==null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.main, new LoginFragment() ).commit();

        }*/

        memail=(EditText) findViewById(R.id.edtemaill);
        mpassword=(EditText) findViewById(R.id.edtpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        mcheckBox = (CheckBox) findViewById(R.id.checkBox);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor=preferences.edit();

        checkSharedPreferences();
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mcheckBox.isChecked())
                {
                    //set  a checkbox when aplication start
                    editor.putString(getString(R.string.checkbox), "True");
                    editor.commit();

                    String email = memail.getText().toString();
                    editor.putString(getString(R.string.email), email);
                    editor.commit();


                    String password = mpassword.getText().toString();
                    editor.putString(getString(R.string.password), password);
                    editor.commit();


                }else{
                    //set  a checkbox when aplication start
                    editor.putString(getString(R.string.checkbox), "False");
                    editor.commit();


                    editor.putString(getString(R.string.email), "");
                    editor.commit();

                    editor.putString(getString(R.string.password), "");
                    editor.commit();

                }
            }
        });
    }

    private void  checkSharedPreferences()
    {
        String check  = preferences.getString(getString(R.string.checkbox), "False");
        String email  = preferences.getString(getString(R.string.email), "");
        String password  = preferences.getString(getString(R.string.password), "");

        memail.setText(email);
        mpassword.setText(password);

        if (check.equals("True")){
            mcheckBox.setChecked(true);
        }
        else{
            mcheckBox.setChecked(false);
        }


    }
   /* public void go(View v)
    {
        Intent a = new Intent(this, NavActivity.class);
        startActivity(a);

    }*/




}
