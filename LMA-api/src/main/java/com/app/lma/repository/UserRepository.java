package com.app.lma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lma.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserNameAndPassword(String userName, String password);

}
