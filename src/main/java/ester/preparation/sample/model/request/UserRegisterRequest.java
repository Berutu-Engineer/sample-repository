/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.model.request;

import java.util.Date;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: UserRegisterRequest.java , v 0.1 2024-08-23 21.56 Yosepri Disyandro Berutu Exp $$
 */
public class UserRegisterRequest {

    /** username */
    private String username;

    /** full name */
    private String fullName;

    /** date of birth */
    private Date dateOfBirth;

    private String email;

    private String phoneNumber;

    private String address;

    private String job;

    private String password;

    private String gender;

    /**
     * Getter method for username
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
