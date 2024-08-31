package com.scaler.splitwise1.service;

import com.scaler.splitwise1.models.Expense;
import com.scaler.splitwise1.models.ExpenseUser;
import com.scaler.splitwise1.models.User;
import com.scaler.splitwise1.repository.ExpenseUserRepository;
import com.scaler.splitwise1.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SettleUpService {

    private UserRepository userRepository;
    private ExpenseUserRepository expenseUserRepository;

    public SettleUpService(UserRepository userRepository, ExpenseUserRepository expenseUserRepository) {
        this.userRepository = userRepository;
        this.expenseUserRepository = expenseUserRepository;
    }

    public List<Expense> settleUpUser(Long userId) {

        /**
        1. Get user from userId
         2. Get all the expenses, user is part of
         3. Iterate through all the expenses and find out who paid
         more and  who paid less
         4. Implement the settle up algo

         **/

        Optional<User> optionalUser = userRepository.findById(userId);

        if(optionalUser.isEmpty()) {
            //  Create a separate package for exceptions
            throw  new RuntimeException("User with id " + userId + " us not found");
        }

        User user = optionalUser.get();

        List<ExpenseUser> expenseUsers = expenseUserRepository.findByUser(user);

        // Remove duplicate expenses using set
        Set<Expense> expenses = new HashSet<>();
        for(ExpenseUser expenseUser: expenseUsers) {
            expenses.add(expenseUser.getExpense());
        }




        return null;
    }
}
