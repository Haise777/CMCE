package com.haise.cmce.dal;

import com.haise.cmce.domain.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    //TODO findByNameAndCompany
}
