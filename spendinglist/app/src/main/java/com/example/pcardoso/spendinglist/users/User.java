package com.example.pcardoso.spendinglist.users;

import android.support.annotation.NonNull;

import static android.support.v4.util.PatternsCompat.EMAIL_ADDRESS;

public class User {


    @NonNull
    private String Email;
    @NonNull
    private String Password;

    public  User(@NonNull final String email, @NonNull final String password) {
        Email = email;
        Password = password;
    }

    @NonNull

    public String getEmail() {
        return Email;
    }

    public void setEmail(@NonNull final String email) {
        Email = email;
    }

    @NonNull
    public String getPassword() {
        return Password;
    }

    public void setPassword(@NonNull final String password) {
        Password = password;
    }

    public static boolean isEmailValid(String email){
        return email!=null && !email.isEmpty() && EMAIL_ADDRESS.matcher(email).matches();
    }

    public static boolean isPassValid(String pass){
        return pass!=null && !pass.isEmpty() && pass.length()>5;
    }
}
