/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.service;

import ester.preparation.sample.model.request.UserRegisterRequest;
import ester.preparation.sample.model.response.UserRegisterResponse;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: UserService.java , v 0.1 2024-08-23 22.02 Yosepri Disyandro Berutu Exp $$
 */
public interface UserService {
    public void registerUser(UserRegisterRequest request, UserRegisterResponse response);
}
