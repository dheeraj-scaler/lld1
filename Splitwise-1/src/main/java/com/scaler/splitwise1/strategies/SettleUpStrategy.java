package com.scaler.splitwise1.strategies;

import com.scaler.splitwise1.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses);
}
