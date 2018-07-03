package com.sealyr.framework.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sealyr.framework.jpa.domain.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {

}
