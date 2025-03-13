package org.example.config;

import org.example.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factoryconfig{
    private static Factoryconfig factoryConfig;
    private SessionFactory sessionFactory;
    private Factoryconfig(){
        Configuration configuration=new Configuration().configure()
                .addAnnotatedClass(Student.class);
        sessionFactory=configuration.buildSessionFactory();

    }

    public static Factoryconfig getIntance(){
        return(factoryConfig==null)?factoryConfig=new Factoryconfig():factoryConfig;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

}
