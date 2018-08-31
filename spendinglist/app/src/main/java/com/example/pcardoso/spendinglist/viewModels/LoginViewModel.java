package com.example.pcardoso.spendinglist.viewModels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.pcardoso.spendinglist.BR;
import com.example.pcardoso.spendinglist.view.fragment.users.User;

public class LoginViewModel extends BaseObservable {

    private User user;
    private String successMessage = "Login ";
    private String errorMessage = "EMAIL or PASSWORD invalid";

    @Bindable
    public String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        // notifyPropertyChanged(BR.toastMessage);
        notifyPropertyChanged(BR.toastMessage);
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

    public void onLoginClicked() {
        if (User.isEmailValid(user.getEmail()) && User.isPassValid(user.getPassword()))
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }
}
