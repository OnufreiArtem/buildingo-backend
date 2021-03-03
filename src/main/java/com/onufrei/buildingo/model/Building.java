package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

/** The representation of Building
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Building {
    @Id
    private String id;
    private String name;
    private String description;
    private Field field;
    private String urlPath;
    private List<Brigade> brigadeList;
    private List<Spending> spendingList;
    private BuildingType buildingType;
    private Schedule schedule;
    private boolean ended = false;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
