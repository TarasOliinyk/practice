package com.lits.service;

import com.lits.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Component
public class TeacherService {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void add(Teacher teacher) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
