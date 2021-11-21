package com.power.doc.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author yu3.sun on 2021/11/21
 */
@Data
public class Employee {

  @JsonProperty("EmpId")
  private String empId;
}
