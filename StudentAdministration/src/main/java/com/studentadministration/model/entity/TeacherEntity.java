package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TeacherEntity {
    @Id
    @NotNull
    @Column(name = "teacherNo",nullable = false)
    private String teacherNo;
    @EmbeddedId
    @Column(name = "instituteNo",nullable = false)
    private String instituteNo;

    @Column(name = "teacherName",nullable = false)
    private String teacherName;

    @Column(name = "hireDate",nullable = false)
    private Date hireDate;

    public TeacherEntity() {
    }

    public TeacherEntity(String teacherNo, String instituteNo, String teacherName, Date hireDate) {
        this.teacherNo = teacherNo;
        this.instituteNo = instituteNo;
        this.teacherName = teacherName;
        this.hireDate = hireDate;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(String instituteNo) {
        this.instituteNo = instituteNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
