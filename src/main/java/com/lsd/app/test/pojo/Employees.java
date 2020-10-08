package com.lsd.app.test.pojo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/29 13:44
 */
@Entity
@Component
public class Employees {
    /**员工号*/
    private String empNo;
    /**生日 yyyy-MM-dd*/
    private String birthDate;
    /**姓名*/
    private String firstName;
    /**姓名*/
    private String lastName;
    /**性别*/
    private String gender;
    /**入职日期 yyyy-MM-dd*/
    private String hireDate;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
