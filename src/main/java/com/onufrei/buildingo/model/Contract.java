package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/** The representation of Contract
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contract {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDate signedDate;
    private LocalDate startDate;
    private LocalDate finishDate;
    private Customer customer;
    private boolean finished;
    private int reward;
    private List<Building> buildingList;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
