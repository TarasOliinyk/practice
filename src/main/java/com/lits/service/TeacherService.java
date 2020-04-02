package com.lits.service;

import com.lits.model.Teacher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class TeacherService {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Adds new teacher to the table 'teacher' to the DB.
     *
     * @param teacher - Specifies the teacher intended to be added
     */
    @Transactional
    public void addTeacher(Teacher teacher) {
        entityManager.persist(teacher);
    }

    /**
     * Retrieves specific teacher from the table 'teacher' in the DB.
     *
     * @param teacherId - Specifies id of the teacher intended to be retrieved
     * @return {@code Teacher}
     */
    public Teacher getTeacher(int teacherId) {
        return entityManager.find(Teacher.class, teacherId);
    }

    /**
     * Retrieves all teachers available in the 'teacher' table in the DB.
     *
     * @return {@code List<Teacher>}
     */
    public List<Teacher> getAllTeachers() {
        return entityManager.createQuery("SELECT t FROM Teacher t").getResultList();
    }

    /**
     * Updates specific teacher in the table 'teacher' in the DB.
     *
     * @param teacher - Specifies the teacher intended to be updated (this object should contain new teacher data)
     * @return {@code Teacher}
     */
    @Transactional
    public Teacher updateTeacher(Teacher teacher) {
        Teacher originalTeacher = entityManager.find(Teacher.class, teacher.getId());
        String firstNameToUpdate = teacher.getFirstName();
        String lastNameToUpdate = teacher.getLastName();

        if (firstNameToUpdate == null || firstNameToUpdate.equals("")) {
            teacher.setFirstName(originalTeacher.getFirstName());
        }

        if (lastNameToUpdate == null || lastNameToUpdate.equals("")) {
            teacher.setLastName(originalTeacher.getLastName());
        }
        return entityManager.merge(teacher);
    }

    /**
     * Deletes specific teacher from the 'teacher' table in the DB.
     *
     * @param teacherId - Specifies id of the teacher intended to be deleted
     */
    @Transactional
    public void deleteTeacher(int teacherId) {
        entityManager.remove(entityManager.find(Teacher.class, teacherId));
    }
}
