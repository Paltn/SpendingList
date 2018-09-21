package com.example.pcardoso.spendinglist.model;

import android.annotation.SuppressLint;
import android.databinding.BaseObservable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense extends BaseObservable {

    private String account;
    private String amount;
    private String title;
    private String category;
    private String description;
    private Date date;

    public Expense(String account, String amount, String title, String category, String description, Date date) {
        this.account = account;
        this.amount = amount;
        this.title = title;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String input) {
        this.title = input;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStringDate(){

        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return sdf.format(date);
    }

    public void setStringDate(String input){
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat aa = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.date=aa.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }



}