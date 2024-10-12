package com.haise.cmce.dal;

import com.haise.cmce.domain.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    public Company findByName(String name);
    public Company findByCnpj(String cnpj);
}
