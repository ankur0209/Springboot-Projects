package com.vishal.UsersBackend.repository;

import com.vishal.UsersBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
