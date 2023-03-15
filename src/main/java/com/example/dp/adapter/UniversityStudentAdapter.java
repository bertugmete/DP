package com.example.dp.adapter;

import lombok.ToString;

@ToString
public class UniversityStudentAdapter implements Student {
    private UniversityStudent universityStudent;


    public UniversityStudentAdapter(UniversityStudent universityStudent) {
        this.universityStudent = universityStudent;
    }

    @Override
    public String getName() {
        return universityStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return universityStudent.getLastName();
    }
}
