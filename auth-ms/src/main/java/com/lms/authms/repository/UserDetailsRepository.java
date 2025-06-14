package com.lms.authms.repository;

import com.lms.authms.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
}
