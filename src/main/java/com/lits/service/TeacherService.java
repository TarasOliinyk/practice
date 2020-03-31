package com.lits.service;

import com.lits.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class TeacherService {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void add(Teacher teacher) {
        entityManagerFactory.createEntityManager().persist(teacher);
    }
}
