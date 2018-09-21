package com.example.pcardoso.spendinglist.viewmodelss;

import android.arch.lifecycle.ViewModel;

import com.example.pcardoso.spendinglist.model.Expense;

import java.util.Date;

public class AddExpenseViewModel extends ViewModel {

    private Expense expense;

    public Expense getExpense() {
        if(expense == null){
            Date date = new Date();
            expense = new Expense("","","","","",date);
        }
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

   /* public updateField(){
       notify();
    }*/




}
