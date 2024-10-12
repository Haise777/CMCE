package com.haise.cmce.dal;

import com.haise.cmce.domain.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByFirstNameAndLastName(String firstName, String lastName);

}
