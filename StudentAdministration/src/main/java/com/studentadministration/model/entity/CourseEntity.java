package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

public class CourseEntity {
    @Id @NotNull
    @Column(name = "courseNo",nullable = false)
    private String courseNo;

    @EmbeddedId
    @Column(name = "instituteNo",nullable = false)
    private String instituteNo;

    @Column(name = "courseName",nullable = false)
    private String courseName;

    @Column(name = "creditHour",nullable = false)
    private int creditHour;

    @Column(name = "courseHour",nullable = false)
    private int courseHour;

    public CourseEntity() {
    }

    public CourseEntity(String courseNo, String instituteNo, String courseName, int creditHour, int courseHour) {
        this.courseNo = courseNo;
        this.instituteNo = instituteNo;
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.courseHour = courseHour;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(String instituteNo) {
        this.instituteNo = instituteNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }
}
