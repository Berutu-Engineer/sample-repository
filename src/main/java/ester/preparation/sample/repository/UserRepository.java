/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.repository;

import ester.preparation.sample.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: UserRepository.java , v 0.1 2024-08-23 22.21 Yosepri Disyandro Berutu Exp $$
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
