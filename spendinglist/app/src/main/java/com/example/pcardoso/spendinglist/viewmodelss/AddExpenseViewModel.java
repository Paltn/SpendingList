package com.example.pcardoso.spendinglist.viewmodelss;

import android.arch.lifecycle.ViewModel;

import com.example.pcardoso.spendinglist.model.Expense;

import java.util.Date;

public class AddExpenseViewModel extends ViewModel {

    Date date = new Date();

    private Expense expense;

    public Expense getExpense() {
        if (expense == null) {

            expense = new Expense("", "", "", "", "", date);
        }

        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

   /* public void updateField(){
       notifyAll();
    }*/


}
