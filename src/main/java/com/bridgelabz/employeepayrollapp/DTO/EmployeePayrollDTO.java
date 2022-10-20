package com.bridgelabz.employeepayrollapp.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    private String name;

    @Min(value = 500)
    private long salary;

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    private String gender;

    @JsonFormat(pattern="dd MM yyyy")
    @NotNull(message = "startDate should Not be Empty")
    @PastOrPresent(message = "startDate should be past or today date")
    private LocalDate startDate;

    @NotBlank
    private String note;

    @NotBlank
    private String profilePic;

    @NotNull
    private List<String> departments;
}
