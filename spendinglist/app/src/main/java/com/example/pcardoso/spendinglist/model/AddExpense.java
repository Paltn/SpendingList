package com.example.pcardoso.spendinglist.model;

import java.util.Date;

public class AddExpense {
    private Integer account;
    private Integer amount;
    private String title;
    private Integer category;
    private String description;
    private Date date;

    public AddExpense(Integer account, Integer amount, String title, Integer category, String description, Date date) {
        this.account = account;
        this.amount = amount;
        this.title = title;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public Integer getAccount() {
        return this.account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer ammount) {
        this.amount = ammount;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategory() {
        return this.category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
