package com.onufrei.buildingo.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/** The representation of MachineryRequest
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MachineryRequest {
    private String id;
    private String description;
    private Machinery machineryModel;
    private Integer numberOfMachinery;
    private LocalDateTime requestedFrom;
    private LocalDateTime requestedTo;
    private LocalDateTime machineryGetDate;
    private LocalDateTime machineryReturnDate;
    private Building buildingWhereRequested;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
