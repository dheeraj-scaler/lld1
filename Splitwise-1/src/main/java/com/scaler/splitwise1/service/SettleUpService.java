package com.scaler.splitwise1.service;

import com.scaler.splitwise1.models.Expense;
import com.scaler.splitwise1.models.ExpenseUser;
import com.scaler.splitwise1.models.User;
import com.scaler.splitwise1.repository.ExpenseUserRepository;
import com.scaler.splitwise1.repository.UserRepository;
import com.scaler.splitwise1.strategies.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SettleUpService {

    private UserRepository userRepository;
    private ExpenseUserRepository expenseUserRepository;
    private SettleUpStrategy settleUpStrategy;

    public SettleUpService(UserRepository userRepository, ExpenseUserRepository expenseUserRepository, SettleUpStrategy settleUpStrategy) {
        this.userRepository = userRepository;
        this.expenseUserRepository = expenseUserRepository;
        this.settleUpStrategy = settleUpStrategy;
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

        if (optionalUser.isEmpty()) {
            //  Create a separate package for exceptions
            throw new RuntimeException("User with id " + userId + " us not found");
        }

        User user = optionalUser.get();

        List<ExpenseUser> expenseUsers = expenseUserRepository.findByUser(user);

        // Remove duplicate expenses using set
        Set<Expense> expenses = new HashSet<>();
        for (ExpenseUser expenseUser : expenseUsers) {
            expenses.add(expenseUser.getExpense());
        }

        List<Expense> expensesToSettle = settleUpStrategy.settleUp(expenses.stream().toList());


        List<Expense> expensesToReturn = new ArrayList<>();

        for (Expense expense : expensesToSettle) {
            for (ExpenseUser expenseUser : expense.getExpenseUsers()) {
                if (expenseUser.getUser().equals(user)) {
                    expensesToReturn.add(expense);
                    break;
                }
            }
        }

        return expensesToReturn;
    }

    public List<Expense> settleUpGroup(Long groupId) {
/**
 1. Get group from groupId
 2. Get all the expenses, group is part of
 3. Iterate through all the expenses and find out who paid
 more and  who paid less
 4. Implement the settle up algo
 **/
        List<Expense> expenseList = new ArrayList<>();
        return expenseList;
    }
}
