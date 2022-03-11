package com.progile.resttemplate.repository;

import com.progile.resttemplate.dto.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResponseRepository extends JpaRepository<UserResponse, Integer> {
}
