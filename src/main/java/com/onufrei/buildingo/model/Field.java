package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/** The representation of Field
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Field {
    @Id
    private String id;
    private String name;
    private String description;
    private String address;
    private Employee chief;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
