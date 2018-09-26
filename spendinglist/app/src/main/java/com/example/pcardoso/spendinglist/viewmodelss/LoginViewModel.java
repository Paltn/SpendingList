package com.example.pcardoso.spendinglist.viewmodelss;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;

import com.example.pcardoso.spendinglist.BR;
import com.example.pcardoso.spendinglist.R;
import com.example.pcardoso.spendinglist.model.User;
import com.example.pcardoso.spendinglist.view.activity.MainActivity;

public class LoginViewModel extends BaseObservable {

    private User user;
    private String successMessage = "Welcome";
    private String errorMessage = "EMAIL or PASSWORD invalid";

    private SharedPreferences preferences;
    private  SharedPreferences.Editor editor;
    private CheckBox mcheckBox;

    @Bindable
    public String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
         notifyPropertyChanged(BR.toastMessage);
        //notifyPropertyChanged(BR.toastMessage);
        //notifyPropertyChanged(BR.toastMessage);
    }

    public LoginViewModel() {
        // user = new User("", "");
        user = new User("", "");

    }

    public void afterEmailTextChanged(CharSequence s) {

        user.setEmail(s.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        user.setPassword(s.toString());
    }

    public void onLoginClicked(View v) {
       /* if (User.isEmailValid(user.getEmail()) && User.isPassValid(user.getPassword()))
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
*/
        Context context =v.getContext();

        if (user.getEmail().toString().isEmpty() || user.getEmail().toString().isEmpty()) {
            setToastMessage(errorMessage);
        } else {

            Intent aa = new Intent(context, MainActivity.class);
            context.startActivity(aa);
            setToastMessage(successMessage);

        }
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor=preferences.edit();
        checkSharedPreferences();

    }

    private void  checkSharedPreferences()
    {
        //ERROR HERE
        String check  = preferences.getString(String.valueOf(R.string.checkbox), "False");
        String email  = preferences.getString(String.valueOf(R.string.email), "");
        String password  = preferences.getString(String.valueOf(R.string.password), "");
        //ERROR HERE

        // String check  = preferences.getString(getString(R.string.checkbox), "False");
        //String email  = preferences.getString(getString(R.string.email), "");
        //String password  = preferences.getString(getString(R.string.password), "");

        user.setEmail(email);
        user.setPassword(password);

        // memail.setText(email);
        //mpassword.setText(password);

        /*if (check.equals("True")){
            mcheckBox.setChecked(true);
        }
        else{
            mcheckBox.setChecked(false);
        }*/

    }


}
