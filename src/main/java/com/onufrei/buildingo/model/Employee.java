package com.onufrei.buildingo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/** The representation of Employee
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @ApiModelProperty(notes="Employee's id. You can left this field as null when adding because id sets automatically")
    @Id
    private String id;
    @ApiModelProperty(notes = "Employee's name")
    private String name;
    @ApiModelProperty(notes = "Employee's surname")
    private String surname;
    @ApiModelProperty(notes = "Employee's phone number")
    private String phoneNumber;
    @ApiModelProperty(notes = "Employee's email")
    private String email;
    @ApiModelProperty(notes = "Employee's home address")
    private String homeAddress;
    @ApiModelProperty(notes = "Employee's CV resume url. Points to the resume file")
    private String resumeUrl;
    @ApiModelProperty(notes = "Employee's date of birth in yyyy-MM-dd format")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @ApiModelProperty(notes = "Employee's hire in yyyy-MM-dd format")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate hireDate;
    @ApiModelProperty(notes = "Employee's fired in yyyy-MM-dd format")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate firedDate;
    @ApiModelProperty(notes = "Employee's specification. Should be specified as the object of EmployeeSpecification")
    private EmployeeSpecification specification;
    @ApiModelProperty(notes = "Created at date in yyyy-MM-dd format")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime created_at;
    @ApiModelProperty(notes = "Modified at date in yyyy-MM-dd format")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime modified_at;
}
