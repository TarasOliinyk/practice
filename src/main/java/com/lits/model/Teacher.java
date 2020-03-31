package com.lits.model;

import javax.persistence.*;

@Entity
@Table
public class Teacher {
    private int id;
    private String firstName;
    private String lastName;

    public Teacher() {
    }
}
