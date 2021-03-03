package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.util.Pair;

import java.time.LocalDateTime;
import java.util.List;

/** The representation of MachineryStorage
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MachineryStorage {
    @Id
    private String id;
    private String address;
    private List<MachineryRequest> requests;
    private List<Pair<Boolean, Machinery>> machineryList;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
