package com.tareas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    private String title;
    private String company;
}
