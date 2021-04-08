package com.onufrei.buildingo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/** The representation of EmployeeSpecification
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
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
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime created_at;
    @ApiModelProperty(notes="The date when Employee specification was lastly modified in yyyy-MM-dd format")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime modified_at;
}
