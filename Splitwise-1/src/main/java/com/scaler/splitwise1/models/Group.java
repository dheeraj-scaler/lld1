package com.scaler.splitwise1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "splitwise_groups")
public class Group extends BaseModel {
    private String name;
    @ManyToMany
    private List<User> members;

    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
}

//  1         M
// Group     User      => M:M
//   M         1
//
//
//  1         1
// Group     Admin      => M:M
//   M         1