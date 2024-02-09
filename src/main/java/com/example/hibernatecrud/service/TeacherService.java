package com.example.hibernatecrud.service;

import com.example.hibernatecrud.model.Teacher;
import com.example.hibernatecrud.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class TeacherService {

    private final SessionFactory sessionFactory;

    public TeacherService() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public Teacher insertTeacherRecord(Teacher teacher) {
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            Long result = (Long) session.save(teacher);
            transaction.commit();
        } catch (Exception exception) {
            System.out.println(exception.getLocalizedMessage());
            exception.printStackTrace();
        } finally {
            session.close();
        }
        return teacher;
    }

    public List<Teacher> findAllTeachers() {
        return null;
    }

    public Teacher findTeacherById(long teacherId) {
        return null;
    }

    public void deleteTeacherRecordById(long teacherId) {
    }

}
