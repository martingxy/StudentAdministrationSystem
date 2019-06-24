package com.studentadministration.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Id;

public class ManagerEntity {
    @Id @NotNull
    @Column(name = "id",nullable = false)
    private String managerID;

    @Column(name = "password",nullable = false)
    private String password;

    public ManagerEntity() {
    }

    public ManagerEntity(String managerID, String password) {
        this.managerID = managerID;
        this.password = password;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
