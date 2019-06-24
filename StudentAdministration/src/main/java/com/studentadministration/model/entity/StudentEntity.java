package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;

public class StudentEntity {
    @Id @NotNull
    @Column(name = "studentNo",nullable = false)
    private String studentNo;

    @EmbeddedId
    @Column(name = "classNo",nullable = false)
    private String classNo;

    @Column(name = "studentName",nullable = false)
    private String studentName;

    @Column(name = "sex",nullable = false)
    private String sex;

    @Column(name = "birthday",nullable = false)
    private int birthday;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "province")
    private String province;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "password",nullable = false)
    private String password;

    public StudentEntity() {
    }

    public StudentEntity(String studentNo, String classNo, String studentName, String sex, int birthday, String telephone, String province, String city, String street, String password) {
        this.studentNo = studentNo;
        this.classNo = classNo;
        this.studentName = studentName;
        this.sex = sex;
        this.birthday = birthday;
        this.telephone = telephone;
        this.province = province;
        this.city = city;
        this.street = street;
        this.password = password;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
