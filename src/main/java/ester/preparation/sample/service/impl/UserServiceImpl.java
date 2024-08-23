/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.service.impl;

import ester.preparation.sample.model.request.UserRegisterRequest;
import ester.preparation.sample.model.response.UserRegisterResponse;
import ester.preparation.sample.repository.UserRepository;
import ester.preparation.sample.repository.entity.User;
import ester.preparation.sample.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: UserServiceImpl.java , v 0.1 2024-08-23 22.03 Yosepri Disyandro Berutu Exp $$
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * @param request
     * @param response
     */
    @Override
    public void registerUser(UserRegisterRequest request, UserRegisterResponse response) {
        // simpan data ke db, tapi melalui repository
        User user = new User();
        user.setCreatedTime(new Date());
        user.setModifiedTime(new Date());
        BeanUtils.copyProperties(request, user);

        User dbResponseUser = userRepository.save(user);

        response.setUserId(String.valueOf(dbResponseUser.getUserId()));
        response.setEmail(dbResponseUser.getEmail());
        response.setFullName(dbResponseUser.getFullName());
        response.setPhoneNumber(dbResponseUser.getPhoneNumber());
    }
}
