package com.studentadministration.model.entity;

import javax.persistence.Entity;

@Entity
public class CourseClassEntity {
    private String courseNo;
    private String cClassNo;
    private String teacherNo;
    private int year;
    private int semester;
    private int capacity;
    private int enrollNumber;
    private String classroom;
}
