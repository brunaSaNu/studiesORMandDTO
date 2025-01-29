package com.brusanu.ormAndDto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusanu.ormAndDto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
