package com.project.rest.respository;

import com.project.rest.entities.Company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRespository extends JpaRepository<Company, Long> {
}
