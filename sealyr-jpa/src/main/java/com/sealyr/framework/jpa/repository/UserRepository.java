package com.sealyr.framework.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sealyr.framework.jpa.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
