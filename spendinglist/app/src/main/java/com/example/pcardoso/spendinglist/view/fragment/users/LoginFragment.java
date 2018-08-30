package com.example.pcardoso.spendinglist.view.fragment.users;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.users.CreateAccountFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private EditText memail;
    private EditText mpassword;
    private Button btnlogin;
    private Button btnregister;
    private CheckBox mcheckBox;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);


        memail = (EditText) view.findViewById(R.id.edtemaill);
        mpassword = (EditText) view.findViewById(R.id.edtpassword);
        btnlogin = (Button) view.findViewById(R.id.btnlogin);
        btnregister = (Button) view.findViewById(R.id.btnregister);
        mcheckBox = (CheckBox) view.findViewById(R.id.checkBox);

        preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        editor = preferences.edit();

        checkSharedPreferences();


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (memail.getText().toString().isEmpty() || mpassword.getText().toString().isEmpty()) {
                    //  Toast.makeText(getApplicationContext(), "EMPTY", Toast.LENGTH_LONG).show();
                    Toast.makeText(getContext(), "EMPTY", Toast.LENGTH_LONG).show();

                } else {


                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.main, new ProfileFragment());
                    fr.addToBackStack(null).commit();
                    Toast.makeText(getContext(), "Welcome", Toast.LENGTH_LONG).show();
                    //  Intent aa = new Intent(LoginActivity.this, MainActivity.class);

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

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main, new CreateAccountFragment());
                fr.addToBackStack(null).commit();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    private void checkSharedPreferences() {
        String check = preferences.getString(getString(R.string.checkbox), "False");
        String email = preferences.getString(getString(R.string.email), "");
        String password = preferences.getString(getString(R.string.password), "");

        memail.setText(email);
        mpassword.setText(password);

        if (check.equals("True")) {
            mcheckBox.setChecked(true);
        } else {
            mcheckBox.setChecked(false);
        }
    }
}
