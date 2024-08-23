/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.controller;

import ester.preparation.sample.model.request.UserRegisterRequest;
import ester.preparation.sample.model.response.UserRegisterResponse;
import ester.preparation.sample.service.UserService;
import ester.preparation.sample.template.ServiceCallback;
import ester.preparation.sample.template.ServiceTemplate;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
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
    public UserRegisterResponse registerUser(@RequestBody UserRegisterRequest userRegisterRequest, HttpServletResponse httpServletResponse) {
        UserRegisterResponse userRegisterResponse = new UserRegisterResponse();

        ServiceTemplate.execute(userRegisterResponse, httpServletResponse, new ServiceCallback() {

            @Override
            public void checkParam() {
                Assert.notNull(userRegisterRequest, "userRegisterRequest must not be null");
                Assert.hasText(userRegisterRequest.getUsername(), "username must not be empty");
                Assert.hasText(userRegisterRequest.getFullName(), "fullName must not be empty");
                Assert.hasText(userRegisterRequest.getPhoneNumber(), "phoneNumber must not be empty");
            }

            @Override
            public void process() {
                userService.registerUser(userRegisterRequest, userRegisterResponse);
            }
        });

        return  userRegisterResponse;
    }
}
