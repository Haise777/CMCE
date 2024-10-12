package com.haise.cmce.domain.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.apache.catalina.User;

import java.util.List;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<Employee> employees;

    //Role permissions

    private boolean canManageCompany;
    private boolean canManageEmployees;
    private boolean canManageRoles;


}
