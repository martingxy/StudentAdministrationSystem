package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import java.util.Date;

public class EnrollEntity {
    @Id @NotNull
    @Column(name = "studentNo",nullable = false)
    private String studentNo;

    @EmbeddedId
    @Column(name = "courseNo",nullable = false)
    private String courseNo;

    @EmbeddedId
    @Column(name = "cClassNo",nullable = false)
    private String cClassNo;

    @Column(name = "score",nullable = false)
    private int score;

    @Column(name = "recordDate",nullable = false)
    private Date recordDate;

    public EnrollEntity() {
    }

    public EnrollEntity(String studentNo, String courseNo, String cClassNo, int score, Date recordDate) {
        this.studentNo = studentNo;
        this.courseNo = courseNo;
        this.cClassNo = cClassNo;
        this.score = score;
        this.recordDate = recordDate;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}
