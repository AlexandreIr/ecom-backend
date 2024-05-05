package com.afdesign.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afdesign.ecom.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
