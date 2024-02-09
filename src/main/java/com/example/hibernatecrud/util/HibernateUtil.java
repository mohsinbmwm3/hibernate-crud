package com.example.hibernatecrud.util;

import com.example.hibernatecrud.model.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    public static final SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            sessionFactory = new Configuration().configure("hibernate-cfg.xml")
                    .addAnnotatedClass(Teacher.class)
                    .buildSessionFactory();
        }
        return null;
    }

}
