package com.lits.model;

import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    private int id;
    private String name;

    public Course() {
    }
}
