package com.bridgelabz.employeepayrollapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    private String name;

    @Min(value = 500)
    private long salary;
}
