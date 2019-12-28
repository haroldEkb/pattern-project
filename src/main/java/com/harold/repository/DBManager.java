package com.harold.repository;

import com.harold.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DBManager {
    private static final SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void createUserTable(){
        Session session = sessionFactory.getCurrentSession();
        if(session.createQuery("from User").getResultList()!=null){
            for (int i = 0; i < 20; i++) {
                session.beginTransaction();
                session.saveOrUpdate(new User(i,"User" + i));
                session.getTransaction().commit();
            }
        }
    }

    public static void dropUserTable(){
        Session session = sessionFactory.getCurrentSession();
        List<User> list = session.createQuery("from User").getResultList();
        session.beginTransaction();
        for (User user : list) {
            session.delete(user);
        }
        session.getTransaction().commit();
    }

}
