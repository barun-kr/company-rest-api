package com.project.rest.controller;

import com.project.rest.entities.Company;
import com.project.rest.respository.CompanyRespository;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class RestController {

  private final CompanyRespository companyRespository;

  @RequestMapping("/companies")
  public HttpEntity getCompanies() {
    List<Company> allCompanies = new ArrayList<>();
    allCompanies = companyRespository.findAll();
    return new ResponseEntity<>(allCompanies, HttpStatus.OK);
  }
}
