package com.jpa.elearning.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "SECTION")
public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer resourceId;

    private String name;

    private int size;

    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
