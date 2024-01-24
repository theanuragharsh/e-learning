package com.jpa.elearning.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "AUTHOR", schema = "e-learning")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auth_sequence")
    @SequenceGenerator(name = "auth_sequence", sequenceName = "auth_sequence", initialValue = 10000, allocationSize = 1)
    private Integer authorId;
    @Column(name = "FIRST_NAME", length = 35)
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;
    @Column(name = "AGE")
    private Integer age;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_AT", nullable = false, insertable = false)
    private LocalDateTime updatedAt;
}
