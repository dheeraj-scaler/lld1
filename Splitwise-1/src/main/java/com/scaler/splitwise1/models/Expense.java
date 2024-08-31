package com.scaler.splitwise1.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    private String description;
    @ManyToOne
    private User createdBy;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;

    @OneToMany
    private List<ExpenseUser> expenseUsers;

    @ManyToOne
    private Group group;
}
