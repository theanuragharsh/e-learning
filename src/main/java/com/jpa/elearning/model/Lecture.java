package com.jpa.elearning.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "LECTURE")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lectureId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resources resources;
}
