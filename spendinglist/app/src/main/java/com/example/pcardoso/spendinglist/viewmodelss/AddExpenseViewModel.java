package com.example.pcardoso.spendinglist.viewmodelss;

import android.databinding.BaseObservable;

import com.example.pcardoso.spendinglist.model.AddExpense;

public class AddExpenseViewModel extends BaseObservable {

    private AddExpense addExpense;

    public AddExpense getAddExpense() {
        return addExpense;
    }

    public void setAddExpense(AddExpense addExpense) {
        this.addExpense = addExpense;
    }

}
