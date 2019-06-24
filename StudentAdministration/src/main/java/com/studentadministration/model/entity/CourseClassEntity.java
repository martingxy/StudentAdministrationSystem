package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseClassEntity {
    @Id @NotNull
    @Column(name = "courseNo",nullable = false)
    private String courseNo;

    @Id @NotNull
    @Column(name = "courseNo",nullable = false)
    private String cClassNo;

    @EmbeddedId
    @Column(name = "teacherNo",table="CourseClass",nullable = false)
    private String teacherNo;

    @Column(name = "year",nullable = false)
    private int year;

    @Column(name = "semester",nullable = false)
    private int semester;

    @Column(name = "capacity",nullable = false)
    private int capacity;

    @Column(name = "enrollNumber",nullable = false)
    private int enrollNumber;

    @Column(name = "classroom",nullable = false)
    private String classroom;

    public CourseClassEntity() {
    }

    public CourseClassEntity(String courseNo, String cClassNo, String teacherNo, int year, int semester, int capacity, int enrollNumber, String classroom) {
        this.courseNo = courseNo;
        this.cClassNo = cClassNo;
        this.teacherNo = teacherNo;
        this.year = year;
        this.semester = semester;
        this.capacity = capacity;
        this.enrollNumber = enrollNumber;
        this.classroom = classroom;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getcClassNo() {
        return cClassNo;
    }

    public void setcClassNo(String cClassNo) {
        this.cClassNo = cClassNo;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnrollNumber() {
        return enrollNumber;
    }

    public void setEnrollNumber(int enrollNumber) {
        this.enrollNumber = enrollNumber;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
