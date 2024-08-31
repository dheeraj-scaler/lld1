package com.scaler.splitwise1.repository;

import com.scaler.splitwise1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long aLong);
}
