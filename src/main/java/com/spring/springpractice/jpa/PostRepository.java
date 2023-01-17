package com.spring.springpractice.jpa;

import com.spring.springpractice.user.Post;
import com.spring.springpractice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
