package com.haise.cmce.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String cnpj;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;

    @NotEmpty
    private String address;

    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Role> roles;

}
