package com.onufrei.buildingo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/** The representation of EmployeeSpecification
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

/*
    TODO: Add time format for create_at and modified_at
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeSpecification {
    @ApiModelProperty(notes="Employee specification Id in UUID format")
    @Id
    private String id;
    @ApiModelProperty(notes="Employee specification name")
    private String name;
    @ApiModelProperty(notes="Employee specification description")
    private String description;
    @ApiModelProperty(notes="Employee specification salary")
    private int salary;
    @ApiModelProperty(notes="The date when Employee specification was created in yyyy-MM-dd format")
    private LocalDateTime created_at;
    @ApiModelProperty(notes="The date when Employee specification was lastly modified in yyyy-MM-dd format")
    private LocalDateTime modified_at;
}
