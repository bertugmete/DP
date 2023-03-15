package com.example.dp.adapter;

import lombok.ToString;

@ToString
public class HighSchoolStudent implements Student {
    private String name;
    private String surname;

    public HighSchoolStudent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }


}
