package com.example.dp.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("High School Student Name", "High School Student Surname");
        studentList.add(highSchoolStudent);

        UniversityStudent universityStudent = new UniversityStudent("University Student Name", "University Student Surname");

        studentList.add(new UniversityStudentAdapter(universityStudent));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
