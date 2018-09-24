package com.example.pcardoso.spendinglist.view.activity;

import android.content.SharedPreferences;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.model.User;
import com.example.pcardoso.spendinglist.databinding.ActivityLoginBinding;
import com.example.pcardoso.spendinglist.viewmodelss.LoginViewModel;


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
    private User user;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        ActivityLoginBinding activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityLoginBinding.setView(new LoginViewModel());
     //activityLoginBinding.setView(new LoginViewModel());
        activityLoginBinding.executePendingBindings();



        //btnlogin = (Button) findViewById(R.id.btnlogin);
        //btnregister = (Button) findViewById(R.id.btnregister);
        //mcheckBox = (CheckBox) findViewById(R.id.checkBox);


        //preferences = PreferenceManager.getDefaultSharedPreferences(this);
       // editor=preferences.edit();

       // checkSharedPreferences();



/*
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aa = new Intent(LoginActivity.this, RegisterUsersActivity.class);
                startActivity(aa);
            }
        });*/
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }

   /* private void  checkSharedPreferences()
    {
        String check  = preferences.getString(getString(R.string.checkbox), "False");
        String email  = preferences.getString(getString(R.string.email), "");
        String password  = preferences.getString(getString(R.string.password), "");


       // user.setEmail(email);

       // user.setEmail(email);
       // user.setPassword(password);


        if (check.equals("True")){
            mcheckBox.setChecked(true);
        }
        else{
            mcheckBox.setChecked(false);
        }

    }*/

}
