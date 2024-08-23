/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.model.response;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: UserRegisterResponse.java , v 0.1 2024-08-23 21.56 Yosepri Disyandro Berutu Exp $$
 */
public class UserRegisterResponse {
    private String userId;

    private String phoneNumber;

    private String fullName;

    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
