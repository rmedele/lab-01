package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date date;

    //Constructor with default date
    public Mood() {
        this.date = new Date();
    }

    //constructor
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //my abstract method to be implemented by subclasses
    public abstract String getMood();
}
