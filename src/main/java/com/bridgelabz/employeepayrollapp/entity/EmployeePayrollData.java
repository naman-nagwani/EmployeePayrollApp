package com.bridgelabz.employeepayrollapp.entity;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeePayrollData {

    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.name = empPayrollDTO.getName();
        this.salary = empPayrollDTO.getSalary();
    }
}
