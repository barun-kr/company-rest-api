package com.project.rest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Company {

  @Id
  private Long id;
  private String name;
}
