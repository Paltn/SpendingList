package com.example.pcardoso.spendinglist.view.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.view.fragment.users.LoginFragment;

public class LoginActivity extends AppCompatActivity {

   // private static final String TAG = "LoginActivity";
    private SharedPreferences preferences;
    private  SharedPreferences.Editor editor;

    private EditText memail;
    private EditText mpassword;
    private Button btnlogin;
    private Button btnregister;
    private AlertDialog alerta;

    private CheckBox mcheckBox;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        memail=(EditText) findViewById(R.id.edtemaill);
        mpassword=(EditText) findViewById(R.id.edtpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnregister = (Button) findViewById(R.id.btnregister);
        mcheckBox = (CheckBox) findViewById(R.id.checkBox);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor=preferences.edit();

        checkSharedPreferences();

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (memail.getText().toString().isEmpty() || mpassword.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "EMPTY", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "GO", Toast.LENGTH_LONG).show();

                    Intent aa = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(aa);
                }

                if (mcheckBox.isChecked()) {
                    //set  a checkbox when aplication start
                    editor.putString(getString(R.string.checkbox), "True");
                    editor.commit();

                    String email = memail.getText().toString();
                    editor.putString(getString(R.string.email), email);
                    editor.commit();

                    String password = mpassword.getText().toString();
                    editor.putString(getString(R.string.password), password);
                    editor.commit();

                } else {
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

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aa = new Intent(LoginActivity.this, RegisterUsersActivity.class);
                startActivity(aa);
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









}
