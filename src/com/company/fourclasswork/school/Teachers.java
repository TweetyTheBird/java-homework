package com.company.fourclasswork.school;

public class Teachers {

    private String name;


    public Teachers(String name) {
        this.name = name;
    }

    public void setStudentAvgGrade(int newGrade, Students student) {
        student.setAvgGrade(newGrade);
    }
}
