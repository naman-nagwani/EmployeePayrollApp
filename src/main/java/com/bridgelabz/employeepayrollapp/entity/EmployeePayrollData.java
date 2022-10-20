package com.bridgelabz.employeepayrollapp.entity;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "employee_department",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> departments;

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.name = empPayrollDTO.getName();
        this.salary = empPayrollDTO.getSalary();
        this.gender = empPayrollDTO.getGender();
        this.startDate = empPayrollDTO.getStartDate();
        this.note = empPayrollDTO.getNote();
        this.profilePic = empPayrollDTO.getProfilePic();
        this.departments = empPayrollDTO.getDepartments();
    }
}
