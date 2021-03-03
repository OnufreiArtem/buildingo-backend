package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.util.Pair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/** The representation of ConstructionManagement
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDate startWork;
    private LocalDate finishWork;
    private List<Pair<Boolean, BuildingPace>> paceList;
    private List<Report> reportList;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
