package com.example.pcardoso.spendinglist.model;

import java.util.Date;

public class AddExpense {
    private Integer account;
    private Integer ammount;
    private String title;
    private Integer category;
    private String description;
    private Date date;

    public AddExpense(Integer account, Integer ammount, String title, Integer category, String description, Date date) {
        this.account = account;
        this.ammount = ammount;
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

    public Integer getAmmount() {
        return this.ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
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
