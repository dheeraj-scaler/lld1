package com.scaler.splitwise1.repository;

import com.scaler.splitwise1.models.ExpenseUser;
import com.scaler.splitwise1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {

    List<ExpenseUser> findByUser(User user);
}
