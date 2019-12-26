package com.harold.repository;

import com.harold.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepositoryImpl implements UserRepository {

    private SessionFactory sessionFactory;
    private Session session;
    private Map<Integer, User> identityMap = new ConcurrentHashMap<>();

    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insert(User user) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        if (user!=null) {
            session.save(user);
            identityMap.put(user.getId(), user);
        }
        session.getTransaction().commit();
    }

    @Override
    public void update(User user) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        if (user!=null) {
            session.update(user);
            identityMap.put(user.getId(), user);
        }
        session.getTransaction().commit();
    }

    @Override
    public void delete(User user) {
        identityMap.remove(user.getId());
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
    }

    private User findUserById(Integer id) {
        if (identityMap.containsKey(id)) {
            return identityMap.get(id);
        }
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        return user;
    }

    @Override
    public User findByUsername(String name) {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, name);
        session.getTransaction().commit();
        return user;
    }

    @Override
    public List<User> selectAll() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<User> userList = session.createQuery("from User").getResultList();
        session.getTransaction().commit();
        return userList;
    }

    public void close(){
        session.close();
        sessionFactory.close();
    }
}
