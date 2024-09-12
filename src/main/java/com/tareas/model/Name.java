package com.tareas.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data

public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String saludation;
}
