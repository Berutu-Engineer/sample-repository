/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.controller;

import ester.preparation.sample.model.request.UserRegisterRequest;
import ester.preparation.sample.model.response.UserRegisterResponse;
import ester.preparation.sample.service.UserService;
import ester.preparation.sample.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: UserController.java , v 0.1 2024-08-23 22.00 Yosepri Disyandro Berutu Exp $$
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("api/user/register")
    public UserRegisterResponse registerUser(@RequestBody UserRegisterRequest userRegisterRequest) {
        UserRegisterResponse userRegisterResponse = new UserRegisterResponse();

        userService.registerUser(userRegisterRequest, userRegisterResponse);

        return  userRegisterResponse;
    }
}
