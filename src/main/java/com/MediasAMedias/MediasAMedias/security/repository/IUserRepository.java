package com.MediasAMedias.MediasAMedias.security.repository;

import com.MediasAMedias.MediasAMedias.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
