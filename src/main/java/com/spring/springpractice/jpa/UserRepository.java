package com.spring.springpractice.jpa;

import com.spring.springpractice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
