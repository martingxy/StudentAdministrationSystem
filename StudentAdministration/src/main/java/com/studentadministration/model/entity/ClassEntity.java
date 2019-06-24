package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Id;

public class ClassEntity {
    @Id @NotNull
    @Column(name = "classNo",nullable = false)
    private String classNo;

    @Column(name = "className",nullable = false)
    private String className;

    @Column(name = "grade",nullable = false)
    private int grade;

    public ClassEntity() {
    }

    public ClassEntity(String classNo, String className, int grade) {
        this.classNo = classNo;
        this.className = className;
        this.grade = grade;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
