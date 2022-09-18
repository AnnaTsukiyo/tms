package com.autoflex.tms.dto.projectDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@AllArgsConstructor
public class ProjectShortResponseDTO {
    private Long id;
    private String projectName;
    private Boolean isActive;
    private String description;
    private String releaseDate;
}
