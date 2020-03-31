package com.lits.model;

import javax.persistence.*;

@Entity
@Table
public class Course {
    private int id;
    private String name;

    public Course() {
    }
}
