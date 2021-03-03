package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
    @Id
    private String id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String homeAddress;
    private String resumeUrl;
    private LocalDate dateOfBirth;
    private LocalDate hireDate;
    private LocalDate firedDate;
    private EmployeeSpecification specification;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
