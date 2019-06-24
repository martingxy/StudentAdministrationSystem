package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

public class InstituteEntity {
    @Id @NotNull
    @Column(name = "instituteNo",nullable = false)
    private String instituteNo;

    @EmbeddedId
    @Column(name = "classNo",nullable = false)
    private String classNo;

    @Column(name = "instituteName",nullable = false)
    private String instituteName;

    public InstituteEntity() {
    }

    public InstituteEntity(String instituteNo, String classNo, String instituteName) {
        this.instituteNo = instituteNo;
        this.classNo = classNo;
        this.instituteName = instituteName;
    }

    public String getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(String instituteNo) {
        this.instituteNo = instituteNo;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
}
