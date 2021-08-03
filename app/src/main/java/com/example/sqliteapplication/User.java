package com.example.sqliteapplication;

import androidx.annotation.NonNull;

public class User

{
    private String name;
    private String dob;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    @Override
    public String toString() {
        return "NAME: "+name+"\nID: "+id+"\nDOB: "+dob;
    }
}
