package com.lits.model;

import javax.persistence.*;

@Entity
@Table
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    public Course() {
    }
}
